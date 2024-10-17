package com.example.onlinecourier.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HubRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String hubLocation;
    private double rate;

    public HubRate() {}

    public HubRate(String hubLocation, double rate) {
        this.hubLocation = hubLocation;
        this.rate = rate;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getHubLocation() { return hubLocation; }
    public void setHubLocation(String hubLocation) { this.hubLocation = hubLocation; }
    public double getRate() { return rate; }
    public void setRate(double rate) { this.rate = rate; }
}
