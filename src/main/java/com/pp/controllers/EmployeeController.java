package com.pp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pp.beans.Employee;
import com.pp.service.IEmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	@GetMapping(value="employee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") String id) {
		Employee employee = employeeService.findById(id);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	@PostMapping(value="employee")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
		Employee resEmp = employeeService.addEmployee(employee);
		return new ResponseEntity<>(resEmp, HttpStatus.OK);
	}
	
}
