package com.satya.jaxrs.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.satya.jaxrs.messenger.database.Database;
import com.satya.jaxrs.messenger.model.Profile;

public class ProfileService {
	public ProfileService() {
		profiles.put("satya", new Profile(1L,"Satya","sai","p"));
	}
	private Map<String,Profile> profiles=Database.getProfile();
	
public List<Profile> getAllProfiles(){

	return new ArrayList<Profile>(profiles.values());
}
public Profile getProfile(String profileName) {
	return profiles.get(profileName);
	
}
public Profile addProfile(Profile profile) {
	profile.setId(profiles.size() + 1);
	profiles.put(profile.getProfileName(),profile);
	
	return profile;
	
}
public Profile updateProfile(Profile profile) {
	if(profile.getProfileName().isEmpty()) {
		return null;
	}
	profiles.put(profile.getProfileName(), profile);
	return profile;	
}
public Profile removeProfile(String profileName) {
	return profiles.remove(profileName);
	
}
}
