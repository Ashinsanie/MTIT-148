package com.microservice.inventory.controller;


import com.microservice.inventory.entity.Inventory;
import com.microservice.inventory.service.InventoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

    @Autowired
    private InventoryService service;

    @PostMapping("/addInventory")
    public Inventory addInventory(@RequestBody Inventory inventory)
    {
        System.out.println(inventory.getProductName());
        return  service.saveInventory(inventory);
    }

    @PostMapping("/addInventories")
    public List<Inventory> addInventories(@RequestBody List<Inventory> inventories){
        return service.saveInventories(inventories);
    }

    @GetMapping("/inventories")
    public List<Inventory> findAllInventories(){
        return service.getInventories();
    }


    @GetMapping("/inventoryById/{id}")
    public Inventory findInventoryById(@PathVariable int id) {
        return service.getInventoryById(id);
    }

    @GetMapping("/inventory/{productName}")
    public Inventory findInventoryByProductName(@PathVariable String productName) {
        return service.getInventoryByProductName(productName);
    }

    @PutMapping("/update")
    public Inventory updateInventory(@RequestBody Inventory inventory) {

        return service.updateInventory(inventory);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteInventory(@PathVariable int id) {
        return service.deleteInventory(id);
    }

}






