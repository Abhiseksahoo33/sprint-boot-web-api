package com.example.springbootwebapi.controller;

import com.example.springbootwebapi.model1.Employee;
import com.example.springbootwebapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class EmployeeController {
@Autowired
    private EmployeeRepository EmployeeRepository;

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
    @GetMapping("/employee/{uuid}") // uid is the resourse identifier
    public Employee getemployeebyuuid(@PathVariable("uuid") String uid)
    {
    return EmployeeRepository.selectByUid(uid);
    }
    @GetMapping("/employee/")
    public List<Employee> getallemployeedetails()
    {
return  EmployeeRepository.selectAll();
    }
}
