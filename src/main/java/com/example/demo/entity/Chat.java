package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    
    
    public Long getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
