package SpingHibernateTest.SpingHibernate.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import SpingHibernateTest.SpingHibernate.Entity.Employee;
import SpingHibernateTest.SpingHibernate.service.EmployeeService;




@RestController
public class EmployeeController {

	@Autowired
	 EmployeeService employeeService;
	
	@RequestMapping(value="/employee", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return employeeService.save(emp);
	}
}