package HibernateTest.FirstHibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="PRODUCT_MASTER")
public class Product {

	// AUTO, IDENTITY, TABLE, SEQUENCE
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@SequenceGenerator(name="seq", initialValue=5, allocationSize=100)
	@Id
	@Column(name="p_id")
	private Long id;
	
	@Column(name="name")
	private String name;

	@Column(name="cost")
	private float price;
	
	public Product() {
	}
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}
	public Product(Long id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString() {
		return id + " - " + name + " - " + price;
	}
}

