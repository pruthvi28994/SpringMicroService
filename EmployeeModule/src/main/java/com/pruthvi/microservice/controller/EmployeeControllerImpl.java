package com.pruthvi.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.pruthvi.microservice.dto.EmployeeResponse;
import com.pruthvi.microservice.entity.Employee;
import com.pruthvi.microservice.service.EmployeeService;

@RestController
public class EmployeeControllerImpl implements EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public ResponseEntity<EmployeeResponse> getEmployeeDetails(Integer employeeId) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployeeDetails(employeeId));
	}

	@Override
	public ResponseEntity<Employee> saveEmployeeDetails(Employee employeeDtl) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeService.saveEmployeeDetails(employeeDtl));
	}

}
