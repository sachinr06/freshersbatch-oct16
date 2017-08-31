package SpringMongoRestTest.SpringMongoTest.dao;


import org.springframework.beans.factory.annotation.Autowired;

import SpringMongoRestTest.SpringMongoTest.collections.UserCollections;
import SpringMongoRestTest.SpringMongoTest.entity.User;
import SpringMongoRestTest.SpringMongoTest.repository.UserRepository;

public class UserDaoImpl implements UserDao {
	@Autowired
UserRepository userRepository;
	public User createUser(User user) {
		UserCollections userCollection=new UserCollections();
		userCollection.setFirstName(user.getFirstName());
		userCollection.setLastName(user.getLastName());
		userCollection.setUserName(user.getUserName());
		userCollection.setPassword(user.getPassword());
		userCollection.setEmail(user.getEmail());
		userCollection.setPhone(user.getPhone());
		userRepository.save(userCollection);
		return user;
	}

}
