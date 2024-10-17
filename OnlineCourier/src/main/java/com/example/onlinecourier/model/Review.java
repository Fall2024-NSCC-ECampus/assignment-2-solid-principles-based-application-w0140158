package com.example.onlinecourier.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int rating;
    private String comment;

    // Default constructor
    public Review() {}

    // Parameterized constructor
    public Review(int rating, String comment) {
        this.rating = rating;
        this.comment = comment;
    }

    // Getters and Setters
    public int getId() { return id; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
    public void setRating(int rating) { this.rating = rating; }
    public void setComment(String comment) { this.comment = comment; }
}
