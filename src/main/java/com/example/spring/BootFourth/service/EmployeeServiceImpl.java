package com.example.spring.BootFourth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.BootFourth.entities.Employee;
import com.example.spring.BootFourth.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee addEmployee(Employee e) {
		return repo.save(e);
	}

	@Override
	public Employee getEmployee(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		return repo.findAll();
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repo.save(e);
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
	}

}