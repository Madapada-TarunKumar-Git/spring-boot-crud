package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	//Get all employees
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//Get employees by ID
	@GetMapping("/{empId}")
	public Optional<Employee> getEmployeeById(@PathVariable Long empId){
		return employeeService.getEmployeeById(empId);
	}
	
	//Creating a new employee
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	//Update employee
	@PutMapping("/{empId}")
	public Employee updateEmployee(@PathVariable Long empId, @RequestBody Employee employee) {
		employee.setEmpId(empId);
		return employeeService.saveEmployee(employee);
	}
	
	//Delete employee
	@DeleteMapping("/{empid}")
	public void deleteEmployee(@PathVariable Long empId) {
		employeeService.deleteEmployee(empId);
	}
}
