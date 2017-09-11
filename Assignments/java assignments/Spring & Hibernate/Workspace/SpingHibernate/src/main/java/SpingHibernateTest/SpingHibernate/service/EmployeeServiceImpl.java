package SpingHibernateTest.SpingHibernate.service;

import org.springframework.beans.factory.annotation.Autowired;


import SpingHibernateTest.SpingHibernate.Entity.Employee;
import SpingHibernateTest.SpingHibernate.dao.EmployeeDao;


public class EmployeeServiceImpl {
	@Autowired
	EmployeeDao employeeDao;
	
	public Employee save (Employee emp){
		
		return employeeDao.save(emp);
	}

}