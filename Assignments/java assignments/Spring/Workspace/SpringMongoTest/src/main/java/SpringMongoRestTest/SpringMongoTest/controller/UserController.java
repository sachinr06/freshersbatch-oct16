package SpringMongoRestTest.SpringMongoTest.controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SpringMongoRestTest.SpringMongoTest.entity.User;
import SpringMongoRestTest.SpringMongoTest.service.UserService;



@RestController
@RequestMapping("/xornet")
public class UserController {
	@Autowired
	UserService userService;

	/*@RequestMapping(value="/matrix/{userDetails}", method=RequestMethod.GET)
	public void printMatrix(
			@MatrixVariable(pathVar="userDetails", name="city") String city) {
		System.out.println("MAP: " + city);
	}

	@RequestMapping(value="/hello/{city}", method=RequestMethod.GET)
	public String sayHello(@RequestParam(name="name", defaultValue="Ivan")
							String uname,
						@PathVariable(value="city") String myCity,
						@RequestHeader(value="auth-token") String authToken) {
		System.out.println("myCity = " + myCity);
		System.out.println("authToken = " + authToken);
		return "Hello " + uname;
	}*/
	
	@RequestMapping(value="/matrix/{userDetails}", method=RequestMethod.GET)
	public void printMatrix(
			@MatrixVariable(pathVar="userDetails") Map<String,String> user_dat) {
		System.out.println("MAP: " + user_dat);
	}

	
	@RequestMapping(value="/hello/{userName}", method=RequestMethod.GET)
	public String sayHello(@RequestParam(name="name", defaultValue="Ivan")
							String uname,
						@PathVariable(value="userName") String user) {
		System.out.println("myName = " + user);

		return "Hello " + user;
	}
	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public void sayHello(
						
						
						@RequestHeader(value="auth-token") String authToken) {

		System.out.println("authToken = " + authToken);
	
	}
	
	@RequestMapping(value="/user", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		users.add(new User("sachin","chotwani","sachin123","sachin123","sachin@gmail.com",12123));
		users.add(new User("ayushi","chotwani","ayushi123","ayushi123","ayushi@gmail.com",1212));
		return users;
	}
	@RequestMapping(value="/user", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user) {
		System.out.println("user = " + user);
		return userService.createUser(user);
	}
}
