package com.example.java.basics.part2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Vehicle {
    private String vehicleId;
    private String vehicleModel;
    private int rentalPricePerDay;

}
