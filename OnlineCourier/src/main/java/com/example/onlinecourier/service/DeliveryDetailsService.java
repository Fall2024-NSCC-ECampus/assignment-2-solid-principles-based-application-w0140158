package com.example.onlinecourier.service;

import com.example.onlinecourier.model.DeliveryDetails;
import com.example.onlinecourier.repository.DeliveryDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryDetailsService {
    private final DeliveryDetailsRepository deliveryDetailsRepository;

    @Autowired
    public DeliveryDetailsService(DeliveryDetailsRepository deliveryDetailsRepository) {
        this.deliveryDetailsRepository = deliveryDetailsRepository;
    }

    public List<DeliveryDetails> getAllDeliveryDetails() {
        return deliveryDetailsRepository.findAll();
    }

    public DeliveryDetails getDeliveryDetailsByTrackingId(String trackingId) {
        return deliveryDetailsRepository.findById(trackingId).orElse(null);
    }

    public DeliveryDetails saveDeliveryDetails(DeliveryDetails deliveryDetails) {
        return deliveryDetailsRepository.save(deliveryDetails);
    }

    public void deleteDeliveryDetails(String trackingId) {
        deliveryDetailsRepository.deleteById(trackingId);
    }
}
