package com.curdexample.curdexample.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.curdexample.curdexample.repo.EmployeeRepo;

public class EmployeeService {
	@Autowired
	EmployeeRepo employeeRepo;
}
