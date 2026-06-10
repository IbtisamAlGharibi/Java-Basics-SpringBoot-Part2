package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Vehicle;
import com.example.java.basics.part2.Inferfaces.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleManager {

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle addVehicle(Vehicle newVehicle){
        Vehicle vehicleToAdd = new Vehicle();

        vehicleToAdd.setVehicleId(newVehicle.getVehicleId());
        vehicleToAdd.setVehicleModel(newVehicle.getVehicleModel());
        vehicleToAdd.setRentalPricePerDay(newVehicle.getRentalPricePerDay());
        vehicleToAdd.setActive(newVehicle.isActive());

        return vehicleRepository.save(vehicleToAdd);
    }
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(String id,String vehicleModel) {
        Vehicle vehicle = vehicleRepository.findById(id).get();

        if (!vehicle.getVehicleModel().equals(vehicleModel)) {
            vehicle.setVehicleModel(vehicleModel);
            System.out.println("Updated");
        }
        System.out.println("Already match");
        return vehicleRepository.save(vehicle);
    }

    public String deleteVehicle(String id) {
        if (!vehicleRepository.existsById(id)) {
            return "ID NOT FOUND";
        }
        vehicleRepository.deleteById(id);
        return "DELETED";
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle getById(String id) {
        return vehicleRepository.findById(id).get();
    }

    /*
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

    public void displayVehicle(){
        System.out.println("Available Vehicles: \n");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
    }*/
}
