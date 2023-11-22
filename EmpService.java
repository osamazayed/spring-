package com.example.demo.service;

import com.example.demo.Model.entity.Employee;
import com.example.demo.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public Employee getUser(Integer id){
        Optional<Employee> emp=this.empRepo.findById(id);
        if (emp.isPresent()){
            return emp.get();
        }
        return null;
    }
    public Employee save(Employee employee){
        return this.empRepo.save(employee);
    }

}
