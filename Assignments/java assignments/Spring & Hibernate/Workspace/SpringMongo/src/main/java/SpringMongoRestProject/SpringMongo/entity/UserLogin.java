package SpringMongoRestProject.SpringMongo.entity;

public class UserLogin {
String userName;
String password;

public UserLogin() {
	super();
}
public UserLogin(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
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
@Override
public String toString() {
	return "UserLogin [userName=" + userName + ", password=" + password + "]";
}

}
