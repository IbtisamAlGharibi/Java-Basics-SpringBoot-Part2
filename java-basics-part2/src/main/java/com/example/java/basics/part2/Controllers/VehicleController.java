package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Vehicle;
import com.example.java.basics.part2.Services.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleManager vehicleManager;


    @PostMapping("/add")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleManager.addVehicle(vehicle);
    }
    @GetMapping("getAll")
    public List<Vehicle> getAll() {
        return vehicleManager.getAllVehicles();
    }
    @GetMapping("getById")
    public Vehicle getById(@RequestParam Integer id) {
        return vehicleManager.getById(String.valueOf(id));
    }
}
