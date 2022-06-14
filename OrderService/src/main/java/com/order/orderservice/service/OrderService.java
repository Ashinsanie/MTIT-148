package com.order.orderservice.service;

import com.order.orderservice.entity.Order;
import com.order.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public Order SaveOrder(Order order){

      return  repository.save(order);

    }

    public List<Order> SaveOrderList(List<Order> orders)
    {
        return  repository.saveAll(orders);

    }
}
