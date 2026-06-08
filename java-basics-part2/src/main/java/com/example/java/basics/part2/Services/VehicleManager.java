package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Employee;
import com.example.java.basics.part2.Entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class VehicleManager {
    List<Vehicle> vehicles = new ArrayList<>();

    public VehicleManager() {

        vehicles.add(new Vehicle("V101", "Toyota Corolla", 20));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22));
    }

    public String addVehicle(Vehicle vehicle){
        System.out.println("List of vehicles: ");
        for (Vehicle vehicleList : vehicles) {
            System.out.println(vehicleList);

            if (vehicleList.getVehicleId().equalsIgnoreCase(vehicle.getVehicleId())) {
                return "vehicle already exists";
            }
        }
       vehicles.add(vehicle);
        return "Vehicle Added successfully";
    }
}
