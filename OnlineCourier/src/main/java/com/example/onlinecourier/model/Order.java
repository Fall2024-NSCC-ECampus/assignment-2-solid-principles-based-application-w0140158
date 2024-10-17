package com.example.onlinecourier.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "delivery_address")
    private String deliveryAddress;

    // Default constructor
    public Order() {}

    // Parameterized constructor
    public Order(Product product, String deliveryAddress) {
        this.product = product;
        this.deliveryAddress = deliveryAddress;
    }

    // Getters and Setters
    public Long getOrderId() {
        return id; // Return the actual ID
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
