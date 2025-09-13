package com.example.system_auto_build.controller;

import com.example.system_auto_build.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/get")
    public String get(){
        return "You are accessing from project";
    }

    @GetMapping("/getsss")
    public String getDetails(){
        return "You are accessing from project from details";
    }
}
