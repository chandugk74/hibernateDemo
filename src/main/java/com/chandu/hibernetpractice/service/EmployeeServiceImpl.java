package com.chandu.hibernetpractice.service;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chandu.hibernetpractice.entity.EmployeeEntity;
import com.chandu.hibernetpractice.model.EmployeeModel;
import com.chandu.hibernetpractice.repository.EmployeeDao;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public EmployeeModel create(EmployeeModel employeeModel) {
		EmployeeEntity e = new EmployeeEntity();
		BeanUtils.copyProperties(employeeModel, e);
//		e.setName(employeeModel.getName());
//		e.setAge(employeeModel.getAge());
//		e.setAddress(employeeModel.getAddress());
		employeeDao.create(e);
		employeeModel.setId(e.getId());
		return employeeModel;
	}

	@Override
	public EmployeeModel getId(int id) {
		EmployeeEntity employee = employeeDao.getByID(id);
		EmployeeModel emp = new EmployeeModel();
		BeanUtils.copyProperties(employee, emp);
		return emp;
	}

	@Override
	public Boolean deleteByID(int id) {
		return employeeDao.deleteByID(id);
	}

	@Override
	public EmployeeEntity updateById(EmployeeEntity employeeEntity) {
		return employeeDao.updateById(employeeEntity);

	}
}
