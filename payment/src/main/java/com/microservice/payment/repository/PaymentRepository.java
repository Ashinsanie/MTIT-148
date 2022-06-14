package com.microservice.payment.repository;

import com.microservice.payment.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository <Payment,Integer>{
    Payment findByProductName(String productName);

}
