package com.vishalspringboot.product.service;

import com.vishalspringboot.product.dto.CategoryDTO;
import com.vishalspringboot.product.entity.Category;
import com.vishalspringboot.product.mapper.CategoryMapper;
import com.vishalspringboot.product.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;//Category entity ko repository mai store karne ke liye ye likha hai

    //create category
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        Category category = CategoryMapper.toCategoryEntity(categoryDTO);//Category mapper ko call karenge taki voh category DTO ko store kar de Category Entity mai
        category = categoryRepository.save(category);//Category save ke time id doesn't get generated
        return CategoryMapper.maptoCategoryDTO(category);
    }
    // get all categories
    // get category by id
    // delete category
}