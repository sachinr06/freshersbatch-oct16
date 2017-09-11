package SpringMongoRestTest.SpringMongoTest.service;



import org.springframework.beans.factory.annotation.Autowired;

import SpringMongoRestTest.SpringMongoTest.dao.UserDao;
import SpringMongoRestTest.SpringMongoTest.entity.User;




public class UserServiceImpl implements UserService {
	@Autowired
	 UserDao userDao;
	public User createUser(User user){
		return userDao.createUser(user);
		
	}
}

