package com.spring.SpringProject;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChatRoomBean {
 String name;

 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public HashSet<String> getUsers() {
	return users;
}

public void setUsers(HashSet<String> users) {
	this.users = users;
}

public List<String> getMessages() {
	return messages;
}

public void setMessages(List<String> messages) {
	this.messages = messages;
}

HashSet<String> users;

 List<String> messages;
}
