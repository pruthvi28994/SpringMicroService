package com.pruthvi.microservice.dto;

import java.util.List;

import com.pruthvi.microservice.entity.Employee;

import lombok.Data;

@Data
public class EmployeeResponse {
	
	private Employee employeeDtl;
	
	private List<Department> departmentDtl;
}
