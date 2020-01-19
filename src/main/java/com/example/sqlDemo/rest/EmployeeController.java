package com.example.sqlDemo.rest;

import java.util.List;
import java.util.Optional;

import com.example.sqlDemo.DTO.Employee;
import com.example.sqlDemo.Dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

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

    @GetMapping(path="/getAllEmployee",produces = "application/json")
    public List<Employee> getAllEmployee(){

        List<Employee> emp = employeeRepository.findAll();

        //logger.info("Employee id 2 -> {}", emp.get());
        return emp;

    }

    @Transactional
    @PostMapping(path="/addEmployee",produces = "application/json",consumes = "application/json")
    public String addEmployee(@RequestBody Employee employee){

        //Optional emp = employeeRepository.findById(1L);
        employeeRepository.saveAndFlush(employee);
        //System.out.println(employee.getFirstName());
        //employeeRepository.flush();


        //logger.info("Employee id 2 -> {}", emp.get());
        return "done";

    }

}