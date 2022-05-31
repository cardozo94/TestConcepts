package oop.patternsdesign.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.iterator.iterator.FacebookIterator;
import oop.patternsdesign.behavioral.iterator.iterator.ProfileIterator;

public class Facebook implements SocialNetwork{

	private List<Profile> profiles;
	
	public Facebook(List<Profile> cache) {
		if(cache != null)
			this.profiles = cache;
		else
			this.profiles = new ArrayList<Profile>();
	}
	
	public Profile requestProfileFromFacebook(String profileEmail) {
		simulateNetworkLatency();
		System.out.println("Facebook: Loading profile '"+profileEmail+"' over the network...");
		return findProfile(profileEmail);
	}
	
	public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
		simulateNetworkLatency();
		System.out.println("Facebook: Loading '" + contactType + "' list of '" + profileEmail + "' over the network...");
		Profile profile = findProfile(profileEmail);
		if(profile != null)
			return profile.getContacts(contactType);
		return null;
	}
	
	private Profile findProfile(String profileEmail) {
		for (Profile profile : profiles) {
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
		return new FacebookIterator(this, "friends", profileEmail);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new FacebookIterator(this, "coworkers", profileEmail);
	}
}
