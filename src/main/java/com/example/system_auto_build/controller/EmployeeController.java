package com.example.system_auto_build.controller;

import com.example.system_auto_build.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
//    public void createEmployee(){
//        Employee employee=new Employee();
//        employee.setName("Ashish");
//    }
    @GetMapping("/get")
    public String get(){
        return "You are accessing from project";
    }
}
