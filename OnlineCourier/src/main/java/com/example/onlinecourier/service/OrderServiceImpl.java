package com.example.onlinecourier.service;

import com.example.onlinecourier.model.Order;
import com.example.onlinecourier.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void placeOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void returnOrder(int orderId) {
        orderRepository.deleteById(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(int orderId) {
        return null;
    }

    @Override
    public Order saveOrder(Order existingOrder) {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }
}
