package com.example.sqlDemo.DTO;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        if(employeeList==null){
            new ArrayList<Employee>();
        }
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
