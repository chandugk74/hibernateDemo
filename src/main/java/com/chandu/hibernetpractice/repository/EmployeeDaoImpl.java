package com.chandu.hibernetpractice.repository;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chandu.hibernetpractice.entity.EmployeeEntity;
import com.chandu.hibernetpractice.model.EmployeeModel;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public EmployeeEntity create(EmployeeEntity employee) {
		Session session = sessionFactory.getCurrentSession();
		session.save(employee);
		return employee;
	}

	@Override
	public EmployeeEntity getByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(EmployeeEntity.class);
		criteria.add(Restrictions.eq("id", id));
		List<EmployeeEntity> em = criteria.list();
		//return (Employee) criteria.list().get(0);
		return em.get(0);
	}

	@Override
	public Boolean deleteByID(int id) {
		Session session = sessionFactory.getCurrentSession();
		Object persistentInstance = session.load(EmployeeEntity.class, id);
		if (persistentInstance != null) {
		    session.delete(persistentInstance);
		    return true;
		}
		return false;
	}

	@Override
	public EmployeeEntity updateById(EmployeeEntity employeeEntity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(employeeEntity);
		return employeeEntity;
	}
}
