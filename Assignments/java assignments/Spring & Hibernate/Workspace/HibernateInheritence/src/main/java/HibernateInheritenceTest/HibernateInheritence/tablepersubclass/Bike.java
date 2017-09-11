package HibernateInheritenceTest.HibernateInheritence.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@PrimaryKeyJoinColumn(name="ID")
public class Bike extends Vehicle{


	@Column(name="bikeName")
	private String bikeName;

	public Bike(double price, String bikeName) {
		super(price);
		this.bikeName = bikeName;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
}
