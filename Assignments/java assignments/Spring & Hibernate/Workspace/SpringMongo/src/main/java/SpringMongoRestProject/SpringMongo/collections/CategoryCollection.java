package SpringMongoRestProject.SpringMongo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Items")
public class CategoryCollection {
 @Id
 String id;
 String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public CategoryCollection(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public CategoryCollection() {

}
 
 
}