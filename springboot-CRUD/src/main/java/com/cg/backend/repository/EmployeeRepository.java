package com.cg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.backend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
