package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
   private Address address;
    private Studentid studentid;

    @Autowired
    public  Student(Address address, Studentid studentid){
        this.address=address;
        this.studentid=studentid;
    }


}
