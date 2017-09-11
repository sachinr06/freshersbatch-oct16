package SpringMongoRestTest.SpringMongoTest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import SpringMongoRestTest.SpringMongoTest.collections.UserCollections;

public interface UserRepository extends MongoRepository<UserCollections,String> {

}
