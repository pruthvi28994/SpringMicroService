package com.pruthvi.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pruthvi.microservice.dto.Department;
import com.pruthvi.microservice.dto.EmployeeResponse;
import com.pruthvi.microservice.entity.Employee;
import com.pruthvi.microservice.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public EmployeeResponse getEmployeeDetails(Integer employeeId) {
		
		var employeeResponse = new EmployeeResponse();
		var employeeDtl = employeeRepo.findById(employeeId).get();
		employeeResponse.setEmployeeDtl(employeeDtl);
		
		//Now We will call Department Module 
		List<Department> departmentDtl = restTemplate.getForObject("http://DEPARTMENT-MODULE/api/department-service/"+employeeDtl.getDepartmentId()+"/department-details", List.class);
		employeeResponse.setDepartmentDtl(departmentDtl);
		// end
		return employeeResponse;
	}

	public Employee saveEmployeeDetails(Employee employeeDtl) {
		return employeeRepo.save(employeeDtl);
	}
}
