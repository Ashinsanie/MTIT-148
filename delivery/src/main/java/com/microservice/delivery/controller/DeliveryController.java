package com.microservice.delivery.controller;


import com.microservice.delivery.entity.Delivery;
import com.microservice.delivery.service.DeliveryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeliveryController {

    @Autowired
    private DeliveryService service;

    @PostMapping("/addDelivery")
    public Delivery addDelivery(@RequestBody Delivery delivery)
    {
        System.out.println(delivery.getLocation());
        return  service.saveDelivery(delivery);
    }

    @PostMapping("/addDeliveries")
    public List<Delivery> addDeliveries(@RequestBody List<Delivery> deliveries){
        return service.saveDeliveries(deliveries);
    }

    @GetMapping("/deliveries")
    public List<Delivery> findAllDeliveries(){
        return service.getDeliveries();
    }


    @GetMapping("/deliveryById/{id}")
    public Delivery findDeliveryById(@PathVariable int id) {
        return service.getDeliveryById(id);
    }

    @GetMapping("/delivery/{location}")
    public Delivery findDeliveryByLocation(@PathVariable String location) {
        return service.getDeliveryByLocation(location);
    }

    @PutMapping("/update")
    public Delivery updateDelivery(@RequestBody Delivery delivery) {

        return service.updateDelivery(delivery);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDelivery(@PathVariable int id) {
        return service.deleteDelivery(id);
    }

}






