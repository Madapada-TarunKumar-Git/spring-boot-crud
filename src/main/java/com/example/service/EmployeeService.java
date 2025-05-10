package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Employee;

public interface EmployeeService {
	List <Employee> getAllEmployees();
	Optional <Employee> getEmployeeById(Long empId);
	Employee saveEmployee(Employee employee);
	void deleteEmployee(Long empId);
	
}
