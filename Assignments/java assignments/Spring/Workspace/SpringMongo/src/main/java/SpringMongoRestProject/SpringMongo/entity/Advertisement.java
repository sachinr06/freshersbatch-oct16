package SpringMongoRestProject.SpringMongo.entity;

public class Advertisement {
String title,name,category,description;

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

public Advertisement(String title, String name, String category, String description) {
	super();
	this.title = title;
	this.name = name;
	this.category = category;
	this.description = description;
}

public Advertisement() {
	
}


}
