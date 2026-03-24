package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;

    private String phone;

    private LocalDateTime pickupTime;

    private LocalDateTime createdAt = LocalDateTime.now();

    private String method;
    
    private String address;
    // 
    @OneToMany(cascade = CascadeType.ALL)
    private List<OrderItem> items;
}