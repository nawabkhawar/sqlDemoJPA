package com.example.sqlDemo.rest;

import java.net.URI;
import java.util.Optional;

import com.example.sqlDemo.DTO.Employee;
import com.example.sqlDemo.Dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.html.Option;

@RestController
@RequestMapping("/mysqlDemo")
public class EmployeeController
{
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping(path="/getEmployee",produces = "application/json")
    public Optional getEmployee(){

        Optional emp = employeeRepository.findById(1L);

        //logger.info("Employee id 2 -> {}", emp.get());
        return emp;

    }

}