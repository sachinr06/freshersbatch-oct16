package HibernateInheritenceTest.HibernateInheritence.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
@PrimaryKeyJoinColumn(name="ID")
public class Car extends Vehicle{

	@Column(name="carName")
	private String carName;

	public Car(double price,String carName) {
		super(price);
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setcarName(String name) {
		this.carName = carName;
	}
}
