package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(nullable = false)
	private String empName;
	
	@Column(nullable = false)
	private String empRole;
	
	//Constructors
	public Employee() {}
	
	public Employee(String empName, String empRole) {
		this.empName = empName;
		this.empRole = empRole;
	}
	
	//Getters and Setters
	public Long getId() {
		return empId;
	}

	public void setId(Long id) {
		this.empId = id;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public String getRole() {
		return empRole;
	}

	public void setRole(String role) {
		this.empRole = role;
	}
	
	//toString() method for debugging
	@Override
	public String toString() {
		return "Employee{" +
				"id=" + empId +
				", name='" + empName + '\'' +
				", role='" + empRole + '\'' +
				'}';
	}
	
	

}
