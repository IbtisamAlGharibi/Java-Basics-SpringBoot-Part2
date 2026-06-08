package com.example.java.basics.part2.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Employee {
    private  String employeeId;
    private String employeeName;
    private String department;

}
