package SpringMongoRestProject.SpringMongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SpringMongoRestProject.SpringMongo.collections.ActionCollection;
import SpringMongoRestProject.SpringMongo.collections.CategoryCollection;
import SpringMongoRestProject.SpringMongo.collections.UserSession;
import SpringMongoRestProject.SpringMongo.repository.LoginRepository;
import SpringMongoRestProject.SpringMongo.repository.ActionRepository;

public class ActionDaoImpl implements ActionDao {
	@Autowired
	LoginRepository loginRepository;
	
	@Autowired
	ActionRepository actionRepository;
	public  List<ActionCollection> getActions(String sessionId) {
		// TODO Auto-generated method stub
		UserSession usersession= loginRepository.findOne(sessionId);
		if(usersession !=null){
			 List<ActionCollection> actionCollection=actionRepository.findAll();
				
				return actionCollection;
		}
		else
		{
			return null;
		}
	}

}