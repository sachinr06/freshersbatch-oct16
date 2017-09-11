package HibernateMappingTest.HibernateMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEMPEMP")
public class Tempemp {


	@Id
	@GeneratedValue
	
	@Column(name="id")
   private Long id;
	
	@Column(name="ename")
	private String ename;
	
	@Column(name="mname")
	private String mname;

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Tempemp(String ename, String mname) {
		super();
		this.ename = ename;
		this.mname = mname;
	}
	
	
}