package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @DeleteMapping("/products/{id}")
    public String deleteProductById(@PathVariable int id)  {
        productService.deleteProductById(id);
        return "DELETED";
    }


}
