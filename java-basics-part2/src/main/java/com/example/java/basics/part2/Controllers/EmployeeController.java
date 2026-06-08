package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Employee;
import com.example.java.basics.part2.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employees")
    public String addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}
