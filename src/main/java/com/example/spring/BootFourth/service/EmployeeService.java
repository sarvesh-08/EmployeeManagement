package com.example.spring.BootFourth.service;

import java.util.List;


import com.example.spring.BootFourth.entities.Employee;


public interface EmployeeService {

	Employee addEmployee(Employee e);
	Employee getEmployee( Long id);
	List<Employee> getAllEmployee();
	Employee updateEmployee( Employee e);
	void deleteEmployee( Long id);
	
}

