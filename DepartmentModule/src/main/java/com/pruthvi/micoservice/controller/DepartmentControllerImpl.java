package com.pruthvi.micoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.pruthvi.micoservice.entity.Department;
import com.pruthvi.micoservice.service.DepartmentService;

@RestController
public class DepartmentControllerImpl implements DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@Override
	public ResponseEntity<List<Department>> getDepartmentData(Integer departmentId) {
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.getDepartmentDetails(departmentId));
	}

	@Override
	public ResponseEntity<List<Department>> saveDeparments(List<Department> departments) {
		return ResponseEntity.status(HttpStatus.OK).body(departmentService.saveDeparments(departments));
	}

}
