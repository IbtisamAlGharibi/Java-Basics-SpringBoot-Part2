package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Product;
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

    public ProductService() {
        loadSampleProducts();
    }

    public String deleteProductById(int productId){
        if (productMap.containsKey(productId)){
            productMap.remove(productId);
            return "Deleted successfully";
        } else {
            return "Product not found";
        }
    }
}
