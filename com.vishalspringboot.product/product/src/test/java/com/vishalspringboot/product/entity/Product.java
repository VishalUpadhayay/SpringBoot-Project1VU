package com.vishalspringboot.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity // Hibernate can know that this is a database table
@Getter @Setter // Lombok generates getters and setters automatically
public class Product {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private Long id;
    private String name;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) // Foreign key to Category table
    private Category category;
}
