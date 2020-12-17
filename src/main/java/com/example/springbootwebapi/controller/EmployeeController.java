package com.example.springbootwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employee/hello")
    public  String saysomthing()
    {
        return "I m learning spring-web-api and you ?";
    }
}
