package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String main;

    @ElementCollection
    private List<String> sides;

    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}