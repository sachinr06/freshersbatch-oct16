package SpringMongoRestProject.SpringMongo.service;

import java.util.List;

import SpringMongoRestProject.SpringMongo.collections.ActionCollection;
import SpringMongoRestProject.SpringMongo.entity.User;

public interface ActionService {

	public List<ActionCollection> getActions(String sessionId);
}
