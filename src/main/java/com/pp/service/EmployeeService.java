package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.beans.Employee;
import com.pp.repo.EmployeeRepo;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee findById(String id) {
		return employeeRepo.findById(id).get();
	}
	

}
