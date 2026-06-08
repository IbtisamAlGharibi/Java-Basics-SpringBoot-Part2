package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Vehicle;
import com.example.java.basics.part2.Services.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @Autowired
    VehicleManager vehicleManager;


    @PostMapping("/add")
    public String addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleManager.addVehicle(vehicle);
    }
}
