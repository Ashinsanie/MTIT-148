package com.microservice.delivery.service;


import com.microservice.delivery.entity.Delivery;
import com.microservice.delivery.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository repository;

    public Delivery saveDelivery(Delivery delivery){

        return repository.save(delivery);

    }
    public List<Delivery> saveDeliveries(List<Delivery> deliveries)
    {

        return repository.saveAll(deliveries);

    }

    public List<Delivery> getDeliveries(){
        return repository.findAll();
    }
    public Delivery getDeliveryById(int id){
        return repository.findById(id).orElse(null);
    }
    public Delivery getDeliveryByLocation(String location){
        return repository.findByLocation(location);
    }
    public String deleteDelivery(int id) {
        repository.deleteById(id);
        return "Driver removed !! " + id;
    }

    public Delivery updateDelivery(Delivery delivery) {
        Delivery existingDelivery = repository.findById(delivery.getId()).orElse(null);
        existingDelivery.setDriverName(delivery.getDriverName());
        existingDelivery.setLocation(delivery.getLocation());
        existingDelivery.setTrackId(delivery.getTrackId());
        existingDelivery.setDate(delivery.getDate());

        return repository.save(existingDelivery);

    }



}
