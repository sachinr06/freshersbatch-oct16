package HibernateInheritenceTest.HibernateInheritence.singletable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue(value="bike")
public class Bike extends Vehicle {

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


