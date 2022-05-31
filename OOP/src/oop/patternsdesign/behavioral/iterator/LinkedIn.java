package oop.patternsdesign.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.iterator.iterator.LinkedInIterator;
import oop.patternsdesign.behavioral.iterator.iterator.ProfileIterator;

public class LinkedIn implements SocialNetwork {
	
	private List<Profile> contacts;
	
	public LinkedIn(List<Profile> cache) {
		if(cache != null)
			this.contacts = cache;
		else
			this.contacts = new ArrayList<Profile>();
	}
	
	public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
		simulateNetworkLatency();
		System.out.println("LinkedIn: Loading profile '" + profileEmail + "' over the network...");

		return findContact(profileEmail);
	}
	
	public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType){
		simulateNetworkLatency();
		System.out.println("LinkedIn: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
		Profile profile = findContact(profileEmail);
		if(profile != null)
			return profile.getContacts(contactType);
		return null;
	}

	private Profile findContact(String profileEmail) {
		for (Profile profile : contacts) {
			if(profile.getEmail().equals(profileEmail))
				return profile;
		}
		return null;
	}
	
	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public ProfileIterator createFriendsIterator(String profileEmail) {
		return new LinkedInIterator(this, "friends", profileEmail);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new LinkedInIterator(this, "coworker", profileEmail);
	}

}
