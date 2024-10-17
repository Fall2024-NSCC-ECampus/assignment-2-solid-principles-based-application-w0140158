package com.example.onlinecourier.controller;


import com.example.onlinecourier.model.Order;
import com.example.onlinecourier.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courier/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public void placeOrder(@RequestBody Order order) {
        orderService.placeOrder(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PutMapping("/orders/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable Long id, @RequestBody Order updatedOrder) {
        Optional<Order> existingOrder = orderService.findById(id);
        if (existingOrder.isPresent()) {
            Order order = existingOrder.get();
            order.setProduct(updatedOrder.getProduct());
            order.setDeliveryAddress(updatedOrder.getDeliveryAddress());
            orderService.save(order);
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }


    @DeleteMapping("/{orderId}")
    public void returnOrder(@PathVariable int orderId) {
        orderService.returnOrder(orderId);
    }
}
