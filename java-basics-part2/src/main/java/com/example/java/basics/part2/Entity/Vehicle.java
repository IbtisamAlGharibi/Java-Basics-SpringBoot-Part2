package com.example.java.basics.part2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String vehicleId;

    private String vehicleModel;
    private int rentalPricePerDay;

}
