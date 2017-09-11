package SpringHibernateApplicationTest.SpringHibernateApplication.dao;

import SpringHibernateApplicationTest.SpringHibernateApplication.entity.User;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.UserLogin;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.UserSession;

public interface UserDao {

	public User register( User user);

	public UserSession loginUser(UserLogin authen);
	
	public User getUser(String sessionId);

	public void logout(String sessionId);
	
	
}