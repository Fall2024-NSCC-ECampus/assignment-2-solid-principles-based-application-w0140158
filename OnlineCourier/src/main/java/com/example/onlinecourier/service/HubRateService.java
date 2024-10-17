package com.example.onlinecourier.service;

import com.example.onlinecourier.model.HubRate;
import com.example.onlinecourier.repository.HubRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HubRateService {
    private final HubRateRepository hubRateRepository;

    @Autowired
    public HubRateService(HubRateRepository hubRateRepository) {
        this.hubRateRepository = hubRateRepository;
    }

    public List<HubRate> getAllHubRates() {
        return hubRateRepository.findAll();
    }

    public HubRate getHubRateByLocation(String location) {
        return hubRateRepository.findByHubLocation(location);
    }

    public HubRate addHubRate(HubRate hubRate) {
        return hubRateRepository.save(hubRate);
    }
}
