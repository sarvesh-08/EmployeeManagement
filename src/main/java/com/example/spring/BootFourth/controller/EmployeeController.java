package com.example.spring.BootFourth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BootFourth.entities.Employee;
import com.example.spring.BootFourth.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e)
	{
		return service.addEmployee(e);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id)
	{
		return service.getEmployee(id);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee e)
	{
		return service.updateEmployee(e);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Long id)
	{
		 service.deleteEmployee(id);
	}

}
