package HibernateInheritenceTest.HibernateInheritence.tableperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BIKE")
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="price", column=@Column(name="price")),  
  
})
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
