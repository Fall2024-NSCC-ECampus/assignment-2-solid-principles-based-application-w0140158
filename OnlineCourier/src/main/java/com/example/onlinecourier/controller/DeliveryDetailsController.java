package com.example.onlinecourier.controller;


import com.example.onlinecourier.model.DeliveryDetails;
import com.example.onlinecourier.service.DeliveryDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courier/deliverydetails")
public class DeliveryDetailsController {

    @Autowired
    private DeliveryDetailsService deliveryDetailsService;

    @GetMapping
    public List<DeliveryDetails> getAllDeliveryDetails() {
        return deliveryDetailsService.getAllDeliveryDetails();
    }

    @PostMapping
    public DeliveryDetails addDeliveryDetails(@RequestBody DeliveryDetails deliveryDetails) {
        return deliveryDetailsService.saveDeliveryDetails(deliveryDetails);
    }

    @DeleteMapping("/{trackingId}")
    public ResponseEntity<Void> deleteDeliveryDetails(@PathVariable String trackingId) {
        deliveryDetailsService.deleteDeliveryDetails(trackingId);
        return ResponseEntity.noContent().build();
    }
}
