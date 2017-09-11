package SpringMongoRestProject.SpringMongo.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="advertisements")
public class AdvertisementCollection {
@Id
String _id;
String title,name,category,description;
public String get_id() {
	return _id;
}
public void set_id(String _id) {
	this._id = _id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public AdvertisementCollection(String _id, String title, String name, String category, String description) {
	super();
	this._id = _id;
	this.title = title;
	this.name = name;
	this.category = category;
	this.description = description;
}
public AdvertisementCollection() {
	
}

}