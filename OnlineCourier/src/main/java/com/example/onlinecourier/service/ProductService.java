package com.example.onlinecourier.service;

import com.example.onlinecourier.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    Product saveProduct(Product product);
    void deleteProduct(int id);
}
