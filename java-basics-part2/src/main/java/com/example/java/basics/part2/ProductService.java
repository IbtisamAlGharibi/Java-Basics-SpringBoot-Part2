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

    private void deleteProductById(int productId){
        if (productMap.containsKey(productId)){
            productMap.remove(productId);
            System.out.println(productMap.get(productId)+ " Deleted successfully");
        }else {
            System.out.println( "Product not found");
        }
    }
}
