package com.example.onlinecourier.service;

import com.example.onlinecourier.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    void placeOrder(Order order);
    void returnOrder(int orderId);
    List<Order> getAllOrders();

    Order getOrderById(int orderId);

    Order saveOrder(Order existingOrder);

    void save(Order order);

    Optional<Order> findById(Long id);
}
