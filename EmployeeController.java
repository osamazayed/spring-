package com.example.demo.controller;

import com.example.demo.Model.entity.Employee;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emplyee")
public class EmployeeController {
    @Autowired
    private EmpService empService;
    @GetMapping("/get-emp")
    public Employee getUser(@RequestParam Integer id){
        return empService.getUser(id);
    }
}
