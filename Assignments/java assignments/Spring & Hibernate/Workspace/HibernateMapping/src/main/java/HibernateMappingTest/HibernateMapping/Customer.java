package HibernateMappingTest.HibernateMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long cust_id;

	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private double phone;

	@OneToOne(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="address_id")
	private Address address;

	public Long getCust_id() {
		return cust_id;
	}

	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Customer(Long cust_id, String name, double phone, Address address) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Customer(String name, double phone, Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

	
	
}
