package SpringHibernateApplicationTest.SpringHibernateApplication.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class UserLogin {

	
	
	@Column(name="username")
	private String userName;
	
	@Column(name="password")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserLogin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public UserLogin() {
		super();
	}

	
	
}
