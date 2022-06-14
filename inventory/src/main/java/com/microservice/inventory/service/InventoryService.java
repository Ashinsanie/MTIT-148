package com.microservice.inventory.service;

import com.microservice.inventory.entity.Inventory;
import com.microservice.inventory.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InventoryService {

    @Autowired
    private InventoryRepo repository;

    public Inventory saveInventory(Inventory inventory){

        return repository.save(inventory);

    }
    public List<Inventory> saveInventories(List<Inventory> inventories){

        return repository.saveAll(inventories);

    }

    public List<Inventory>  getInventories(){
        return repository.findAll();
    }
    public Inventory getInventoryById(int id){
        return repository.findById(id).orElse(null);
    }
    public Inventory getInventoryByProductName(String product_name){
        return repository.findByProductName(product_name);
    }
    public String deleteInventory(int id) {
        repository.deleteById(id);
        return "Stock removed !! " + id;
    }

    public Inventory updateInventory(Inventory inventory) {
        Inventory existingInventory = repository.findById(inventory.getId()).orElse(null);
        existingInventory.setStockCategory(inventory.getStockCategory());
        existingInventory.setProductName(inventory.getProductName());
        existingInventory.setQuantity(inventory.getQuantity());
        existingInventory.setPrice(inventory.getPrice());

        return repository.save(inventory);

    }





}
