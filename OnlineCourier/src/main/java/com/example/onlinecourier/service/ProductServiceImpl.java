package com.example.onlinecourier.service;

import com.example.onlinecourier.model.Product;
import com.example.onlinecourier.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll(); // Fetch all products from DB
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById((long) id).orElse(null);
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById((long) id);
    }
}
