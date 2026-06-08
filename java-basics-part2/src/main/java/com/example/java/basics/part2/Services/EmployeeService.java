package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("E101", "Ahmed", "IT"));
        employees.add(new Employee("E102", "Sara", "HR"));
        employees.add(new Employee("E103", "John", "Finance"));
    }

    public String addEmployee(Employee employee) {

        System.out.println("List of employees: ");
        for (Employee employeeList : employees) {
            System.out.println(employeeList);

            if (employeeList.getEmployeeId().equalsIgnoreCase(employee.getEmployeeId())) {
                return "Employee ID already exists";
            }
        }
        employees.add(employee);

        return "Employee added successfully.";
    }
}
