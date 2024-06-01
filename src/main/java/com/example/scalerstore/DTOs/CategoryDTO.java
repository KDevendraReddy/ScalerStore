package com.example.scalerstore.DTOs;

import com.example.scalerstore.Models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CategoryDTO {
    private String name;
    private String description;
    //private List<Product> productList = new ArrayList<>();
}
