package com.chandu.hibernetpractice.service;

import com.chandu.hibernetpractice.model.EmployeeModel;

public interface EmployeeService {
	EmployeeModel create(EmployeeModel employeeModel);

	EmployeeModel getId(int id);

	Boolean deleteByID(int id);
}
