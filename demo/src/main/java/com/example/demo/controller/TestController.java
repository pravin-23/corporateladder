package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService service ;
	
	@GetMapping("/data")
	public List<String> getData(){
		return Arrays.asList("A","B","Test","Data");
	}
	

	@GetMapping("/empData")
	public List<Employee> getEmpData(){
		return service.getAllEmployee();
	}
	
	
	

}
