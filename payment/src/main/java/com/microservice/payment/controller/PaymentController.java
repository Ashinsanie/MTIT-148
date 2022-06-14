package com.microservice.payment.controller;

import com.microservice.payment.entity.Payment;
import com.microservice.payment.service.PaymentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody Payment payment)
    {
        System.out.println(payment.getProductName());
        return  service.savePayment(payment);
    }

    @PostMapping("/addPayments")
    public List<Payment> addPayments(@RequestBody List<Payment> payments){
        return service.savePayments(payments);
    }

    @GetMapping("/payments")
    public List<Payment> findAllPayments(){
        return service.getPayments();
    }


    @GetMapping("/paymentById/{id}")
    public Payment findPaymentById(@PathVariable int id) {
        return service.getPaymentById(id);
    }

    @GetMapping("/payment/{productName}")
    public Payment findPaymentByProductName(@PathVariable String productName) {
        return service.getPaymentByProductName(productName);
    }

    @PutMapping("/update")
    public Payment updatePayment(@RequestBody Payment payment) {

        return service.updatePayment(payment);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePayment(@PathVariable int id) {
        return service.deletePayment(id);
    }

}
