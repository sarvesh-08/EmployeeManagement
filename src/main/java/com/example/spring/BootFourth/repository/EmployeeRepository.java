package com.example.spring.BootFourth.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.BootFourth.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	List<Employee> findAll();
}
