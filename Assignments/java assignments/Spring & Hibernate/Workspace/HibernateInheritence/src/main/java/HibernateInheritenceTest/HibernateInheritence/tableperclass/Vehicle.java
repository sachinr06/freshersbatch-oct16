package HibernateInheritenceTest.HibernateInheritence.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

@Entity
@Table(name="VEHICLE")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="price")
	private double price;

	public Vehicle(double price) {
		super();
		this.price = price;
	}

}
