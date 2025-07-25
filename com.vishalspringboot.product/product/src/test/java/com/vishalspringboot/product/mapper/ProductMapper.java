package com.vishalspringboot.product.mapper;

import com.vishalspringboot.product.dto.ProductDTO;
import com.vishalspringboot.product.entity.Category;
import com.vishalspringboot.product.entity.Product;

public class ProductMapper {

    //In mapper class generally we make 2 methods for Entity->DTO & DTO->Entity;

    //entity convert to DTO
    public static ProductDTO toProductDTO(Product product){
        return new ProductDTO( //All args constructor which we have made in ProductDTO class we will use and pass all values to set CategoryId in the ProductDT0 and this we are doing to convert it from entity to DTO
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getCategory().getId()
        );
    }

    //DTO to entity
    public static Product toProductEntity(ProductDTO productDTO, Category category){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setCategory(category);

        return product;
    }

}
