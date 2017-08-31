package SpringMongoRestProject.SpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import SpringMongoRestProject.SpringMongo.collections.CategoryCollection;
import SpringMongoRestProject.SpringMongo.collections.UserSession;

public interface CategoryRepository extends MongoRepository<CategoryCollection,String>{

}
