package com.cg.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.backend.exception.ResourceNotFoundException;
import com.cg.backend.model.Employee;
import com.cg.backend.repository.EmployeeRepository;
import com.cg.backend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {

		return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {

		// we need to check whether employee with given id is exist in DB or not
		Employee existingEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));

		existingEmployee.setFirst_name(employee.getFirst_name());
		existingEmployee.setLast_name(employee.getLast_name());
		existingEmployee.setEmail(employee.getEmail());

		// save existing employee to DB
		employeeRepository.save(existingEmployee);
		return existingEmployee;

	}

	@Override
	public void deleteEmployee(int id) {

		// check whether a employee exist in a DB or not
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
	}

}