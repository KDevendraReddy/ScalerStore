package com.example.scalerstore.Models;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Category {
    private String name;
    private String description;
    private List<Product> productList = new ArrayList<>();
}
