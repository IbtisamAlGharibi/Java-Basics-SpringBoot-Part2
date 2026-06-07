package com.example.java.basics.part2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
   static ProductService  productService = new ProductService();

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable int id)  {
        productService.deleteProductById(id);
    }


}
