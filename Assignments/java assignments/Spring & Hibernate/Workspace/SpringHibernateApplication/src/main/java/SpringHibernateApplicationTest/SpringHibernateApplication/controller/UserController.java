package SpringHibernateApplicationTest.SpringHibernateApplication.controller;

import java.util.List;


import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Advertisement;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Category;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Message;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.User;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.UserLogin;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.UserSession;
import SpringHibernateApplicationTest.SpringHibernateApplication.service.AdvertisementService;
import SpringHibernateApplicationTest.SpringHibernateApplication.service.CategoryService;
import SpringHibernateApplicationTest.SpringHibernateApplication.service.UserService;






@CrossOrigin(origins="*")
@RestController
@RequestMapping("/quikr")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	AdvertisementService adService;
	
	/*@Autowired
	ActionService actionService;*/


	@RequestMapping(value="/register", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User createUser(@RequestBody User user) {
		System.out.println("user = " + user);
		return userService.register(user);
	}
	

	@RequestMapping(value="/login", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String login(@RequestBody UserLogin authen) {
		UserSession usersession=userService.loginUser(authen);
		JSONObject json=new JSONObject();
		json.put("auth-token", usersession.getAuthid());
		json.put("userName", usersession.getUserName());
		return json.toString();
	}
	
	
	@RequestMapping(value="/categories", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String getAllCategories(){
		List<Category> items= categoryService.getAllCategories();
		JSONObject itemList=new JSONObject();
		JSONObject json=new JSONObject();
		itemList.put("itemList", items);
		json.put("data", itemList);
		return json.toString();
	}
	
	
	@RequestMapping(value="/postAd", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Advertisement postAd(@RequestBody Advertisement ad,@RequestHeader(value="auth-token") String sessionId) {

	 return adService.postAd(ad, sessionId);
	}
	

	@RequestMapping(value="/user", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User getUser(@RequestHeader(value="auth-token")String sessionId){
		
		User u= userService.getUser(sessionId);
		return u;
	}
	
	

	@RequestMapping(value="/search", method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String searchAll(){
		return adService.searchAll();
	}



@RequestMapping(value="/userAd", method=RequestMethod.GET,
		produces=MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String getUserAds(@RequestHeader(value="auth-token") String sessionId){

	return adService.getUserAds(sessionId);
}



@RequestMapping(value="/searcht", method=RequestMethod.GET,
		produces=MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String searchText(@RequestHeader(value="auth-token")String text){
	
	return adService.searchText(text);
}


@RequestMapping(value="/viewAd", method=RequestMethod.GET,
produces=MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody String viewAd(@RequestParam("postId") Long postId){
	return adService.viewAd(postId);
}


@RequestMapping(value="/editAd", method=RequestMethod.POST,
		consumes=MediaType.APPLICATION_JSON_VALUE,
		produces=MediaType.APPLICATION_JSON_VALUE)
public @ResponseBody Advertisement editAd(@RequestBody Advertisement ad,@RequestHeader(value="auth-token") String sessionId) {
	 return adService.editAd(ad, sessionId);
		}




@RequestMapping(value="/deleteAd", method=RequestMethod.DELETE)
public @ResponseBody void deleteAd(@RequestHeader(value="auth-token") String sessionId,@RequestHeader(value="postid") long postid) {

 adService.deleteAd(postid);
}


	@RequestMapping(value="/logout", method=RequestMethod.DELETE)
	public @ResponseBody void logout(@RequestHeader(value="auth-token") String sessionId) {

	 userService.logout(sessionId);
	}
	
	
	@RequestMapping(value="/message", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String sendMessage(@RequestBody Message m) {
		System.out.println("in controller"+m.getData());
		Message ma=adService.sendMessage(m);
		JSONObject json=new JSONObject();
		json.put("Message", "success");
		System.out.println(ma);
		return json.toString();
	}

}

