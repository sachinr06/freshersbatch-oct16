package SpringMongoRestProject.SpringMongo.repository;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import SpringMongoRestProject.SpringMongo.collections.UserCollections;
import SpringMongoRestProject.SpringMongo.entity.User;

public interface UserRepository extends MongoRepository<UserCollections,String> {
	@Query(value="{userName:?0,password:?1}")
	public UserCollections getusersbyauthen(String userName,String password);
	
	@Query(value="{userName:?0}")
	public UserCollections getusersbyusername(String userName);
	
}
