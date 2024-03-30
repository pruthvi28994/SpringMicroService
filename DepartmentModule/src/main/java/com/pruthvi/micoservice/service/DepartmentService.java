package com.pruthvi.micoservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruthvi.micoservice.entity.Department;
import com.pruthvi.micoservice.repository.DeparmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DeparmentRepository departmentRepo;
	
	public List<Department> getDepartmentDetails(Integer departmentId){
		if(departmentId.equals(0)) {
			return departmentRepo.findAll();
		}
		return new ArrayList<>(List.of(departmentRepo.findById(departmentId).get()));
	}

	public List<Department> saveDeparments(List<Department> departments) {
		return departmentRepo.saveAll(departments);
	}
}
