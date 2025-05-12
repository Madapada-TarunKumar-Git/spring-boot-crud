package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employees") // Matches the database table name
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @Column(nullable = false)
    private String empName;

    @Column(nullable = false)
    private String empRole;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String empName, String empRole) {
        this.empName = empName;
        this.empRole = empRole;
    }

    // Getters and Setters
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    // toString() method for debugging
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + empId +
                ", name='" + empName + '\'' +
                ", role='" + empRole + '\'' +
                '}';
    }
}
