package com.example.onlinecourier.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/courier")
public class CourierController {

    @GetMapping
    public ResponseEntity<String> getServiceInfo() {
        return new ResponseEntity<>("Welcome to the Online Courier Service API! Use the following endpoints to manage your resources.", HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity<Map<String, String>> getEndpoints() {
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Products", "/api/courier/products - Manage products.");
        endpoints.put("Orders", "/api/courier/orders - Place and manage orders.");
        endpoints.put("Hub Rates", "/api/courier/hubrates - Get hub rate information.");
        endpoints.put("Delivery Details", "/api/courier/deliverydetails - Manage delivery details.");

        return new ResponseEntity<>(endpoints, HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<String> getHealthStatus() {
        return new ResponseEntity<>("API is up and running!", HttpStatus.OK);
    }
}
