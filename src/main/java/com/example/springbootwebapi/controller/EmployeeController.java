package com.example.springbootwebapi.controller;

import com.example.springbootwebapi.model1.Employee;
import com.example.springbootwebapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
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


    @PostMapping("/employee/")
    public Employee saveEmployee(@RequestBody Employee e)
    {
    String Uid= UUID.randomUUID().toString();
    e.setUid(Uid);
    return EmployeeRepository.insert(e);
    }
    @PutMapping("/employee/{uuid}")
    public Employee updateEmployee(@RequestBody Employee e,@PathVariable("uuid") String uid)
    {
        e.setUid(uid);
        return EmployeeRepository.update(e);
    }
    @DeleteMapping("/employee/{uuid}") // uid is the resourse identifier
    public int deleteemployeebyuuid(@PathVariable("uuid") String uid)
    {
        return EmployeeRepository.delete(uid);
    }

}

