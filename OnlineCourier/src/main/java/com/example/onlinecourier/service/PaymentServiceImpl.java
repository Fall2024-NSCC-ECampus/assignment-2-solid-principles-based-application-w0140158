package com.example.onlinecourier.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public boolean processPayment(double amount) {
        return true;
    }
}
