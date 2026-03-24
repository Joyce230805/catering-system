package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameEn;
    private String nameCn; 

    private String category; // MAIN / SIDE

    private Double price;

    private Boolean availableToday;
    
}