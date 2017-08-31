package SpringMongoRestProject.SpringMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SpringMongoRestProject.SpringMongo.collections.ActionCollection;
import SpringMongoRestProject.SpringMongo.dao.ActionDao;

public class ActionServiceImpl implements ActionService {
	@Autowired
	ActionDao actionDao;
	public List<ActionCollection> getActions(String sessionId) {
		// TODO Auto-generated method stub
		return actionDao.getActions(sessionId);
	}

}
