package com.vishalspringboot.product.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor //hame argument likhne ke jarurat nahi hai dono ki madat se ab voh annotation se hi ho jayega
@NoArgsConstructor //
public class CategoryDTO {
    private Long id;//important nahi hai kyuki user name hi send karega
    private String name;
    private List<ProductDTO>products;//api mai koi bhi category search kare toh usme jitne saare product hai voh aaye
}
