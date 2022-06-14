package com.microservice.inventory.repository;

import com.microservice.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository <Inventory,Integer>
    {
        Inventory findByProductName(String productName);

    }





