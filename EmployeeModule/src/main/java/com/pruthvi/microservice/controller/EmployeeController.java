package com.pruthvi.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pruthvi.microservice.dto.EmployeeResponse;
import com.pruthvi.microservice.entity.Employee;

@Validated
public interface EmployeeController {
	
	@GetMapping("/{employeeId}/Employee-Details")
	public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable Integer employeeId);
	
	@PostMapping("/save-employee")
	public ResponseEntity<Employee> saveEmployeeDetails(@RequestBody Employee employeeDtl);
}
