package com.pp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pp.beans.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

}
