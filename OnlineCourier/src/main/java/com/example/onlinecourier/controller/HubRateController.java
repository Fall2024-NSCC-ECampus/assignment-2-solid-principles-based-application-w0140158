package com.example.onlinecourier.controller;

import com.example.onlinecourier.model.HubRate;
import com.example.onlinecourier.service.HubRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hubrates")
public class HubRateController {

    private final HubRateService hubRateService;

    @Autowired
    public HubRateController(HubRateService hubRateService) {
        this.hubRateService = hubRateService;
    }

    @GetMapping
    public List<HubRate> getAllHubRates() {
        return hubRateService.getAllHubRates();
    }

    @GetMapping("/{location}")
    public HubRate getHubRateByLocation(@PathVariable String location) {
        return hubRateService.getHubRateByLocation(location);
    }

    @PostMapping
    public HubRate addHubRate(@RequestBody HubRate hubRate) {
        return hubRateService.addHubRate(hubRate);
    }
}
