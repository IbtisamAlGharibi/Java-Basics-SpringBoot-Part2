package com.example.java.basics.part2.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name =" Employee")
public class Employee {
    public Employee(String employeeId,
                    String employeeName,
                    String department) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  String employeeId;

    private String employeeName;
    private String department;
    private boolean isActive;
    @OneToMany
    List<Campaign> campaigns;
    @OneToMany
    List<Vehicle> vehicles;

}
