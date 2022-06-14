package com.microservice.payment.service;

import com.microservice.payment.entity.Payment;
import com.microservice.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public Payment savePayment(Payment payment){

        return repository.save(payment);

    }
    public List<Payment> savePayments(List<Payment> payments){

        return repository.saveAll(payments);

    }

    public List<Payment> getPayments(){
        return repository.findAll();
    }
    public Payment getPaymentById(int id){
        return repository.findById(id).orElse(null);
    }
    public Payment getPaymentByProductName(String product_name){
        return repository.findByProductName(product_name);
    }
    public String deletePayment(int id) {
        repository.deleteById(id);
        return "Payment removed !! " + id;
    }

    public Payment updatePayment(Payment payment) {
        Payment existingPayment = repository.findById(payment.getId()).orElse(null);
        existingPayment.setProductName(payment.getProductName());
        existingPayment.setQuantity(payment.getQuantity());
        existingPayment.setTotal(payment.getTotal());
        existingPayment.setUserEmail(payment.getUserEmail());
        existingPayment.setPaymentType(payment.getPaymentType());
        existingPayment.setCardNO(payment.getCardNO());
        existingPayment.setCvn(payment.getCvn());
        return repository.save(existingPayment);

    }

}
