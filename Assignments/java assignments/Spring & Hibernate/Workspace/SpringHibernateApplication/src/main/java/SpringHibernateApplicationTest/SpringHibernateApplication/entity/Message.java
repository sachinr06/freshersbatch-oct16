package SpringHibernateApplicationTest.SpringHibernateApplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Message {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id

	@Column(name="id")
	private Long id;

	@Column(name="data")
	private String data;
	
	@OneToOne(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="authid")
	private UserSession user;

	

	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="advid")
	Advertisement ad;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public UserSession getUser() {
		return user;
	}



	public void setUser(UserSession user) {
		this.user = user;
	}



	public Advertisement getAd() {
		return ad;
	}



	public void setAd(Advertisement ad) {
		this.ad = ad;
	}



	public Message(Long id, String data, UserSession user, Advertisement ad) {
		super();
		this.id = id;
		this.data = data;
		this.user = user;
		this.ad = ad;
	}



	public Message(String data, UserSession user, Advertisement ad) {
		super();
		this.data = data;
		this.user = user;
		this.ad = ad;
	}



	public Message(String data) {
		super();
		this.data = data;
	}



	public Message() {
		super();
	}
	
	
}