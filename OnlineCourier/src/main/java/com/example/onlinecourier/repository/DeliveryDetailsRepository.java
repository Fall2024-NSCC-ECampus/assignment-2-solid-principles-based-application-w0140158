package com.example.onlinecourier.repository;

import com.example.onlinecourier.model.DeliveryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryDetailsRepository extends JpaRepository<DeliveryDetails, String> {
}
