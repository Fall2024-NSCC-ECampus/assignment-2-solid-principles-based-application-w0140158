package com.example.onlinecourier.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DeliveryDetails {
    @Id
    private String trackingId;
    private String status;

    // Default constructor
    public DeliveryDetails() {}

    // Parameterized constructor
    public DeliveryDetails(String trackingId, String status) {
        this.trackingId = trackingId;
        this.status = status;
    }

    // Getters and Setters
    public String getTrackingId() { return trackingId; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
