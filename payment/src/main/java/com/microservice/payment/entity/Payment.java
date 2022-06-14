package com.microservice.payment.entity;

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
@Table(name = "payment")

public class Payment {

    @Id
    @GeneratedValue
    private int id;
    private String productName;
    private int quantity;
    private double total;
    private String userEmail;
    private String paymentType;
    private int cardNO;
    private int cvn;

}
