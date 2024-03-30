package com.pruthvi.micoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruthvi.micoservice.entity.Department;

@Repository
public interface DeparmentRepository extends JpaRepository<Department, Integer> {

}
