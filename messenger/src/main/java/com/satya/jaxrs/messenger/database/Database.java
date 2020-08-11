package com.satya.jaxrs.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.satya.jaxrs.messenger.model.Messenger;
import com.satya.jaxrs.messenger.model.Profile;

public class Database {

	private static Map<Long,Messenger> messages=new HashMap<>();
	private static Map<Long,Profile> profile=new HashMap<>();
	
	public static Map<Long,Messenger> getMessages(){
		return messages;
		
	}
	public static Map<Long,Profile> getProfile(){
		return profile;
		
	}	
	
}
