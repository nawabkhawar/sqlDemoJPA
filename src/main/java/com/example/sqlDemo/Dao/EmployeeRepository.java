package com.example.sqlDemo.Dao;

import com.example.sqlDemo.DTO.Employee;
import com.example.sqlDemo.DTO.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,Long> {



   /* public Employees getEmployee(){

    }*/
}
