package HibernateCachingTest.HibernateCaching;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMP2_MASTER")
public class Employee {

	
	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="EMP_ID")
	private Long id;
	
	@Column(name="ENAME")
	private String name;

	@Column(name="SALARY")
	private int salary;
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}





	public Employee(Long id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}


	public Employee() {
		
	}


	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

