package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Campaign;
import com.example.java.basics.part2.Entity.Employee;
import com.example.java.basics.part2.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

  @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/getById")
    public Employee getById(@RequestParam Integer id) {
        return employeeService.getById(String.valueOf(id));
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody String id, @RequestParam String name) {
        return employeeService.updateEmployee(id, name);
    }
}
