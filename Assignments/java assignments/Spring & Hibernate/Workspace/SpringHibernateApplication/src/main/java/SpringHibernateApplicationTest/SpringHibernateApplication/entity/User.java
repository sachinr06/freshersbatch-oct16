package SpringHibernateApplicationTest.SpringHibernateApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {

	



		
		// AUTO, IDENTITY, TABLE, SEQUENCE
		@GeneratedValue(strategy=GenerationType.AUTO)
		
		@Id
		@Column(name="user_id")
		private Long id;
		
		@Column(name="firstname")
		private String firstName;

		@Column(name="lastname")
		private String lastName;

		
		
		@Column(name="username",unique=true)
		private String userName;
		
		@Column(name="password")
		private String password;
		
		@Column(name="email",unique=true)
		private String email;
		
		@Column(name="phone",unique=true)
		private Long phone;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

		public User(Long id, String firstName, String lastName, String userName, String password, String email,
				Long phone) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.phone = phone;
		}

		public User(String firstName, String lastName, String userName, String password, String email, Long phone) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.phone = phone;
		}

		public User() {
			
		}

		@Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
					+ userName + ", password=" + password + ", email=" + email + ", phone=" + phone + "]";
		}

		
		

}

