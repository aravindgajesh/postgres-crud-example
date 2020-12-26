package com.ecofreeze.postgrescrud.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecofreeze.postgrescrud.model.Employee;
import com.ecofreeze.postgrescrud.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/{id}")
	public Employee findEmployeeId(@PathVariable("id") Long id) {
		
		Employee emp =  employeeService.findEmployeeId(id);
		
		return emp;
	}
}
