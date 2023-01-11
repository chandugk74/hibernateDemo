package com.chandu.hibernetpractice.repository;

import com.chandu.hibernetpractice.entity.Employee;

public interface EmployeeDao {
	Employee create(Employee employee);

	Employee getByID(int id);

	Boolean deleteByID(int id);

}
