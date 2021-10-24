package com.example.productservice.model;

import com.example.productservice.entity.Product;
import lombok.*;

@Getter
@Setter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor
public class ProductModel {
    private Integer id;
    private String name;
    private String description;
    private String image;
    private int quantity;
    private float price;

    public static ProductModel from(Product product) {
        return ProductModel.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .image(product.getImage())
                .quantity(product.getQuantity())
                .price(product.getPrice())
                .build();
    }
}
