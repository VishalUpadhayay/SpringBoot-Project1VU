package com.vishalspringboot.product.mapper;

import com.vishalspringboot.product.dto.CategoryDTO;
import com.vishalspringboot.product.entity.Category;

public class CategoryMapper {

    //Method to convert Entity to DTO
    public static CategoryDTO maptoCategoryDTO(Category category){//another method made for CategoryDTO
        if(category == null){//edge case laga dete hai suppose agar Category is null toh voh return kar dega null;
            return null;
        }
        CategoryDTO categoryDTO = new CategoryDTO();//CategoryDTO ka object banaya;
        categoryDTO.setId(category.getId());//pahle id nahi tha lekin ab hai jo id category se aaya hai;
        categoryDTO.setName(category.getName());
        categoryDTO.setProducts(category.getProducts().stream().map(ProductMapper::toProductDTO).toList());// All products of Category we are going to convert it into ProductDTO and then we will make it in List form and will set them into CategoryDTO;
        return categoryDTO;
    }

    //Method to convert DTO to Entity
    public static Category toCategoryEntity(CategoryDTO categoryDTO){//method made for CategoryEntity
        Category category = new Category();
        category.setName(categoryDTO.getName());
        return category;
    }
}
