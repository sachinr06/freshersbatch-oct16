package SpringMongoRestProject.SpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import SpringMongoRestProject.SpringMongo.collections.ActionCollection;

public interface ActionRepository extends MongoRepository<ActionCollection,String> {

}
