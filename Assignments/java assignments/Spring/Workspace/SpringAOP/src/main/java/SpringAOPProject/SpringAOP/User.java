package SpringAOPProject.SpringAOP;
import java.util.*;
public class User {
 String uname,password,fname,country;
 boolean loginstatus;
static List <User> users=new ArrayList<User>();
public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public User(String uname, String password, String fname, String country) {
	super();
	this.uname = uname;
	this.password = password;
	this.fname = fname;
	this.country = country;
	this.loginstatus=false;
}

public User() {

	this.uname = "";
	this.password = "";
	this.fname ="" ;
	this.country ="";
	this.loginstatus=false;
}
public void register(String uname, String password, String fname, String country) {
	
User u=new User(uname,password,fname,country);
 users.add(u);
}
 
public void login(String uname,String password){
	

		this.loginstatus=true;
		System.out.println("LOGIN SUCCESSFUL");
	     
}

public void logout(String uname,String password){

		this.loginstatus=false;
		System.out.println("LOGOUT SUCCESSFUL");
	
}


}
