package SpringMongoRestProject.SpringMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import SpringMongoRestProject.SpringMongo.collections.AdvertisementCollection;
import SpringMongoRestProject.SpringMongo.collections.CategoryCollection;

public interface AdvertismentRepository extends MongoRepository<AdvertisementCollection,String> {

}
