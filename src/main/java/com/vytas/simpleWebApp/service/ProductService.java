package com.vytas.simpleWebApp.service;

import com.vytas.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 2000),
            new Product(102, "Canon Camera", 700),
            new Product(103, "MacBook", 2500));

    public List<Product> getProducts() {
        return products;
    }
}
