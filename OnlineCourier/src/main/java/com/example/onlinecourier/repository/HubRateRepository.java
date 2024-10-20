package com.example.onlinecourier.repository;

import com.example.onlinecourier.model.HubRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HubRateRepository extends JpaRepository<HubRate, Long> {
    HubRate findByHubLocation(String hubLocation);
}
