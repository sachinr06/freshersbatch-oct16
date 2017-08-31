package SpringMongoRestProject.SpringMongo.service;



import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import SpringMongoRestProject.SpringMongo.collections.ActionCollection;
import SpringMongoRestProject.SpringMongo.collections.AdvertisementCollection;
import SpringMongoRestProject.SpringMongo.collections.CategoryCollection;
import SpringMongoRestProject.SpringMongo.collections.UserCollections;
import SpringMongoRestProject.SpringMongo.collections.UserSession;
import SpringMongoRestProject.SpringMongo.dao.ActionDao;
import SpringMongoRestProject.SpringMongo.dao.UserDao;
import SpringMongoRestProject.SpringMongo.entity.Advertisement;
import SpringMongoRestProject.SpringMongo.entity.Category;
import SpringMongoRestProject.SpringMongo.entity.User;
import SpringMongoRestProject.SpringMongo.entity.UserLogin;

public class UserServiceImpl implements UserService {
	@Autowired
	 UserDao userDao;
	
	
	public User createUser(User user){
		return userDao.createUser(user);
		
	}
	
	public UserSession loginUser(UserLogin authen){
		return userDao.loginUser(authen);
		
		
	}

	public void logout(String sessionId) {
		// TODO Auto-generated method stub
		userDao.logout(sessionId);
	}

	public AdvertisementCollection postAd(Advertisement ad,String SessionId) {
		// TODO Auto-generated method stub
		return 	userDao.postAd(ad,SessionId);
	}
	
	public List<CategoryCollection> getAllCategories() {
		// TODO Auto-generated method stub
		return 	userDao.getAllCategories();
	}

	public UserCollections getUser(String sessionId) {
		// TODO Auto-generated method stub
		return  userDao.getUser(sessionId);
	}
	

}

