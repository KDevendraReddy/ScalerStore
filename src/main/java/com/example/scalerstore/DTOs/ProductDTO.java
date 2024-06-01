package com.example.scalerstore.DTOs;

import com.example.scalerstore.Models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDTO {
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private Category category;
}

