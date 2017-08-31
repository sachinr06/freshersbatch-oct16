package SpringMongoRestProject.SpringMongo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="user_session")
public class UserSession {
	@Id String sessionid;
	String userName;
	

	public String getSessionid() {
		return sessionid;
	}
	
	public UserSession() {
		
	}

	public UserSession(String sessionid, String userName) {
		super();
		this.sessionid = sessionid;
		this.userName = userName;
	}

	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
