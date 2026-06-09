package com.example.java.basics.part2.Services;

import com.example.java.basics.part2.Entity.Employee;
import com.example.java.basics.part2.Inferfaces.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){

        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(String id, String name) {

        Employee employee = employeeRepository.findById(id).get();
        if (!employee.getEmployeeName().equals(name)) {
            employee.setEmployeeName(name);
        }


   /* List<Employee> employees = new ArrayList<>();

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
        String result = "Employee Id: " + employee.getEmployeeId()
                + " Employee Name: " + employee.getEmployeeName()
                + " Added successfully."
                + "\n Updated list of employees:\n";

        for (Employee employeeList : employees) {
            result += employeeList;
        }
        return result;
    }*/
}
