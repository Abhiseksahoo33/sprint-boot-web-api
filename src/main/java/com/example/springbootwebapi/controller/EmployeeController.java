package com.example.springbootwebapi.controller;

import com.example.springbootwebapi.model1.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class EmployeeController {

    @GetMapping("/employee/hello")
    public  String saysomthing()
    {
        return "I m learning spring-web-api and you ?";

    }
    @GetMapping("/employee/defaultemployee")
    public Employee  defaultemployeedata()
    {
        Employee  e =new Employee(01, UUID.randomUUID().toString(),"Abhisek","Sahoo");
        return e;
    }
}
