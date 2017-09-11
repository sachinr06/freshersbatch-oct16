package SpringMongoRestProject.SpringMongo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Actions")
public class ActionCollection {

	@Id
	String _id;
	String name;
	
	public ActionCollection() {
	
	}
	public ActionCollection(String _id, String name) {
		super();
		this._id = _id;
		this.name = name;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}