package com.vishalspringboot.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    //DTO mai koi sensitive data show nahi karna hota publically.
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Long CategoryId;
}
