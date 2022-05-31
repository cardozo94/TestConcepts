package oop.patternsdesign.behavioral.iterator.iterator;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.iterator.LinkedIn;
import oop.patternsdesign.behavioral.iterator.Profile;

public class LinkedInIterator implements ProfileIterator {

	private LinkedIn linkedIn;
	private String type;
	private String email;
	private int currentPosition = 0;
	private List<String> emails = new ArrayList<String>();
	private List<Profile> contacs = new ArrayList<Profile>();
	
	
	public LinkedInIterator(LinkedIn linkedIn, String type, String email) {
		this.linkedIn = linkedIn;
		this.type =type;
		this.email = email;
	}
	
	private void lazyLoad() {
		if(emails.size()==0) {
			List<String> profiles = linkedIn.requestRelatedContactsFromLinkedInAPI(email, type);
			for (String profile : profiles) {
				this.emails.add(profile);
				this.contacs.add(null);
			}
		}
	}
	@Override
	public boolean hasNext() {
		lazyLoad();
		return currentPosition < emails.size();
	}

	@Override
	public Profile getNext() {
		if(!hasNext())
			return null;
		String friendEmail = emails.get(currentPosition);
		Profile friendContact = contacs.get(currentPosition);
		if(friendContact ==  null) {
			friendContact = linkedIn.requestContactInfoFromLinkedInAPI(friendEmail);
			contacs.set(currentPosition, friendContact);
		}
		currentPosition++;
		return friendContact;
	}

	@Override
	public void reset() {
		currentPosition =0;
	}

}
