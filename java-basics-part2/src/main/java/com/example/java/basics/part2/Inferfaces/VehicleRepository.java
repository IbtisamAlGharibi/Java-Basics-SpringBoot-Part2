package com.example.java.basics.part2.Inferfaces;

import com.example.java.basics.part2.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,String> {
    @Query("SELECT v FROM Vehicle WHERE v.isActive=true")
    List<Vehicle> getAllVehicles();

    @Query("SELECT v from Vehicle v WHERE v.isActive=true AND v.id=:vehicleId")
    Vehicle getVehicleById(@Param("vehicleId") Integer id);

    @Query(" SELECT v from Vehicle v WHERE v.isActive=true AND v.vehicleModel=:vehicleModel")
    Vehicle getVehicleByModel(@Param("vehicleModel") String vehicleModel);
}
