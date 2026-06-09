package com.example.java.basics.part2.Inferfaces;

import com.example.java.basics.part2.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface EmployeeRepository extends JpaRepository<Employee,String > {
}
