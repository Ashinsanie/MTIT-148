package com.microservice.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Inventory")

public class Inventory {

    @Id
    @GeneratedValue
    private int id;
    private String stockCategory;
    private String productName;
    private int quantity;
    private double price;





}
