package com.order.orderservice.controller;
import com.order.orderservice.entity.Order;
import com.order.orderservice.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderservice;

    @PostMapping("/api/addOrder")
    public Order addOrder(@RequestBody Order order){

        System.out.println(order.getOrderName());
        return  orderservice.SaveOrder(order);
    }

    @PostMapping("/api/addOrders")
    public List<Order> addOrders(@RequestBody List<Order>  orders){

        return  orderservice.SaveOrderList(orders);
    }
}
