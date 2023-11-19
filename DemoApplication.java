package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.awt.*;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext apc = SpringApplication.run(DemoApplication.class, args);

		Address address=new Address();
		Studentid studentid=new Studentid();
		Student x=new Student(address,studentid);
		Student z=new Student(address ,studentid);





	}


}

