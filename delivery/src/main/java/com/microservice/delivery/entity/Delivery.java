package com.microservice.delivery.entity;

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
@Table(name = "Delivery")
public class Delivery {

    @Id
    @GeneratedValue
    private int id;
    private String driverName;
    private String location;
    private int trackId;
    private int date;




}
