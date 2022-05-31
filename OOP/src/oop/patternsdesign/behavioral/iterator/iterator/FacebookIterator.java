package oop.patternsdesign.behavioral.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.iterator.Facebook;
import oop.patternsdesign.behavioral.iterator.Profile;

public class FacebookIterator implements ProfileIterator {
	
	private Facebook facebook;
	private String type;
	private String email;
	private int currentPostion = 0;
	private List<String> emails = new ArrayList<String>();
	private List<Profile> profiles = new ArrayList<Profile>();
	
	public FacebookIterator(Facebook facebook, String type, String email) {
		this.facebook = facebook;
		this.type = type;
		this.email = email;
	}
	
	private void lazyLoad() {
		if(emails.size()==0) {
			List<String> profiles = facebook.requestProfileFriendsFromFacebook(this.email, this.type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.profiles.add(null);
			}
		}
	}

	@Override
	public boolean hasNext() {
		lazyLoad();
		return currentPostion < emails.size();
	}

	@Override
	public Profile getNext() {
		if(!hasNext()) 
			return null;
		String friendEmail = emails.get(currentPostion);
		Profile friendProfile = profiles.get(currentPostion);
		if(friendProfile== null) {
			friendProfile = facebook.requestProfileFromFacebook(friendEmail);
			profiles.set(currentPostion, friendProfile);
		}
		currentPostion++;
		return friendProfile;
	}

	@Override
	public void reset() {
		currentPostion =0;
	}

}
