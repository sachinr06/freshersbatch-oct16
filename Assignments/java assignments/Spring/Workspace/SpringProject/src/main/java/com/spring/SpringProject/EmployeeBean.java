package com.spring.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmployeeBean {
String name;
//@Autowired
//@Qualifier("department1")
DepartmentBean deparment1;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public DepartmentBean getDeparment1() {
	return deparment1;
}
public void setDeparment1(DepartmentBean dept) {
	this.deparment1 = dept;
}

}
