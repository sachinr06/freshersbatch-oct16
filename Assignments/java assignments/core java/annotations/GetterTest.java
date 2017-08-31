//package com.training.annotations;
//import com.training.annotations.Getter;

class Employee{
	
	String name;
	int age;
	double salary;
	String position;
	
	
	Employee(String name,int age,double salary, String position)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.position=position;
		
		
		
	}
	
	@Getter
	public String getName()
	{
		return this.name;
		
	}
	
	@Getter
	public int getAge()
	{
		
		return this.age;
	}
	
	@Getter
	public double getSalary()
	{
		
		return this.salary;
		
	}
	
	@Getter
	public String getPosition()
	{
	
	return this.position;
	}
	
	
	@Getter
	public String add()
	{
	
	return this.position;
	}
}

public class GetterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("Sachin",22,34000,"ASE");
		e.getName();
		e.getAge();
		e.getSalary();
		e.getPosition();
     
	}

}
