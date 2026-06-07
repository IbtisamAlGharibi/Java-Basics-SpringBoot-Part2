package com.example.java.basics.part2;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class ProductService {
    private HashMap<Integer, Product> productMap = new HashMap<>();

    public void loadSampleProducts(){
        productMap.put(1, new Product(1, "Laptop", 500));
        productMap.put(2, new Product(2, "Phone", 300));
        productMap.put(3, new Product(3, "Tablet", 200));
    }
}
