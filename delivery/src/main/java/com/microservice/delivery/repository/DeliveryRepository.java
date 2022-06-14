package com.microservice.delivery.repository;

import com.microservice.delivery.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository <Delivery,Integer>{
    Delivery findByLocation(String Location);


}
