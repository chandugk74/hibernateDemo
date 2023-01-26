package com.chandu.hibernetpractice.repository;

import com.chandu.hibernetpractice.entity.EmployeeEntity;
import com.chandu.hibernetpractice.model.EmployeeModel;

public interface EmployeeDao {
	EmployeeEntity create(EmployeeEntity employee);

	EmployeeEntity getByID(int id);

	Boolean deleteByID(int id);

	EmployeeEntity updateById(EmployeeEntity employeeEntity);

}
