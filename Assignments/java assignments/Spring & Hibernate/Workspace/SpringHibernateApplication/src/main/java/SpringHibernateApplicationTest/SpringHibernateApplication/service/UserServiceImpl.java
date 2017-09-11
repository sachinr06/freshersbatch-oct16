package SpringHibernateApplicationTest.SpringHibernateApplication.service;

import org.springframework.beans.factory.annotation.Autowired;

import SpringHibernateApplicationTest.SpringHibernateApplication.dao.UserDao;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.User;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.UserLogin;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.UserSession;

public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	public User register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
	}
	public UserSession loginUser(UserLogin authen) {
		// TODO Auto-generated method stub
		return userDao.loginUser(authen);
	}
	public User getUser(String sessionId) {
		// TODO Auto-generated method stub
		return userDao.getUser(sessionId);
	}
	
	public void logout(String sessionId) {
		userDao.logout(sessionId);
		
	}

}