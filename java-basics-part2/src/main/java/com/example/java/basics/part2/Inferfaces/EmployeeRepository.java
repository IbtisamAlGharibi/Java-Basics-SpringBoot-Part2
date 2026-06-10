package com.example.java.basics.part2.Inferfaces;

import com.example.java.basics.part2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository public interface EmployeeRepository extends JpaRepository<Employee,String > {
    @Query("SELECT e FROM Employee WHERE e.isActive=true")
    List<Employee> getAllEmployees();

    @Query("SELECT e from Employee e WHERE e.isActive=true AND e.id=:employeeId")
    Employee getEmployeeById(@Param("employeeId") Integer id);

    @Query(" SELECT e from Employee e WHERE e.isActive=true AND e.employeeName=:employeeName")
    Employee getEmployeeByName(@Param("employeeName") String employeeName);
}
