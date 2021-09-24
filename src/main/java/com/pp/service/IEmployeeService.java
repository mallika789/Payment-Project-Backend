package com.pp.service;

import com.pp.beans.Employee;

public interface IEmployeeService {
	Employee addEmployee(Employee employee);

	Employee findById(String id);

}
