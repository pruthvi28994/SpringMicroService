package com.pruthvi.micoservice.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pruthvi.micoservice.entity.Department;

public interface DepartmentController {
	
	@GetMapping("/{departmentId}/department-details")
	public ResponseEntity<List<Department>> getDepartmentData(@PathVariable Integer departmentId);
	
	@PostMapping("/save-departments")
	public ResponseEntity<List<Department>> saveDeparments(@RequestBody List<Department> departments);
}
