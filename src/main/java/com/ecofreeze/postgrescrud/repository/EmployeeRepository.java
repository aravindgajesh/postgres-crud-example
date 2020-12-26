package com.ecofreeze.postgrescrud.repository;

import org.springframework.stereotype.Repository;

import com.ecofreeze.postgrescrud.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByEmployeeId(long employeeId);
}
