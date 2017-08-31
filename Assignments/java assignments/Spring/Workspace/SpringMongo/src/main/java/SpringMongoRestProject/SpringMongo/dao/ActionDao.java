package SpringMongoRestProject.SpringMongo.dao;

import java.util.List;

import SpringMongoRestProject.SpringMongo.collections.ActionCollection;

public interface ActionDao {

	public  List<ActionCollection> getActions(String sessionId);
}
