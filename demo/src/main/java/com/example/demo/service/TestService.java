package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class TestService {

	@Autowired
	EmployeeRepo employeeRepo ;
	
	//Get all the students
	public List<Employee> getAllEmployee() {
	List<Employee> emp = employeeRepo.findAll();
	return emp;
	}

}
