package com.example.scalerstore.Controller;

import com.example.scalerstore.DTOs.ProductDTO;
import com.example.scalerstore.Models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Long productId){
    Product product = new Product();
    product.setId(productId);
    product.setName("Ice Cream");
    product.setDescription("Thanda Thanda cool cool");
    return product;

    }

    @PostMapping
    public Product createProduct(ProductDTO productDTO)
    {

    }
}
