package com.satya.jaxrs.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.satya.jaxrs.messenger.database.Database;
import com.satya.jaxrs.messenger.model.Messenger;

public class MessengerService {
	public MessengerService() {
		messages.put(1L, new Messenger(1,"Hello world","satya"));
		messages.put(2L, new Messenger(2,"Hello jersy","satyasai"));
	}
	
	private Map<Long,Messenger> messages=Database.getMessages();
	
public List<Messenger> getAllMessages(){
	
	/*Messenger m1=new Messenger(1L,"Hello world","satya");
	Messenger m2=new Messenger(2L,"Hello jersy","satya sai");
	List<Messenger> lst=new ArrayList<>();
	lst.add(m1);
	lst.add(m2);*/
	return new ArrayList<Messenger>(messages.values());
}
public Messenger getMessages(long id) {
	return messages.get(id);
	
}
public Messenger addMessages(Messenger messenger) {
	messenger.setId(messages.size() + 1);
	messages.put(messenger.getId(), messenger);
	
	return messenger;
	
}
public Messenger updateMessages(Messenger messenger) {
	if(messenger.getId()<=0) {
		return null;
	}
	messages.put(messenger.getId(), messenger);
	return messenger;	
}
public Messenger removeMessages(long id) {
	return messages.remove(id);
	
}
}
