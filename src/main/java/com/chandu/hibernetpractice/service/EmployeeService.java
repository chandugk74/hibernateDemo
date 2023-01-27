package com.chandu.hibernetpractice.service;

import java.util.List;

import com.chandu.hibernetpractice.entity.EmployeeEntity;
import com.chandu.hibernetpractice.model.EmployeeModel;

public interface EmployeeService {
	EmployeeModel create(EmployeeModel employeeModel);

	EmployeeModel getId(int id);

	Boolean deleteByID(int id);
	EmployeeEntity updateById(EmployeeEntity employeeEntity);

	List<EmployeeModel> getAll();
}
