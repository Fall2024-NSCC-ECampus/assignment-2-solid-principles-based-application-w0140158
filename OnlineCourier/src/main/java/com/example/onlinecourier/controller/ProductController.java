package com.example.onlinecourier.controller;

import com.example.onlinecourier.model.Product;
import com.example.onlinecourier.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courier/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        Product existingProduct = productService.getProductById(productId.intValue());
        if (existingProduct == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        Product updatedProduct = productService.saveProduct(existingProduct);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long productId) {
        productService.deleteProduct(productId.intValue());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
