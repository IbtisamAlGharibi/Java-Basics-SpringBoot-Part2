package com.example.java.basics.part2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int productId;
   private String productName;
   private int price;


}
