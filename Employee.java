package com.example.demo.Model.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;

@Table(name ="employee")
@Entity


public class Employee {
    @Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id") // uses if the name in database different name attributes in class (emp_id =name of the database ,id =name of the attribute in class)
    private Integer id;
    @Column(name="fname")
    private String firstname;
    @Column(name="lname")

    private String larstname;
    private Double salary;

    public Employee(Integer id, String firstname, String larstname, Double salary) {
        this.id = id;
        this.firstname = firstname;
        this.larstname = larstname;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLarstname() {
        return larstname;
    }

    public void setLarstname(String larstname) {
        this.larstname = larstname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", larstname='" + larstname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
