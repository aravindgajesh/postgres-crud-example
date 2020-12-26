package com.ecofreeze.postgrescrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecofreeze.postgrescrud.model.Employee;
import com.ecofreeze.postgrescrud.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public Employee findEmployeeId(Long employeeId) {
		return employeeRepository.findByEmployeeId(employeeId);
	}
}
