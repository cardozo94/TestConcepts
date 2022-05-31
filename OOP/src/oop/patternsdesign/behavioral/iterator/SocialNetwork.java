package oop.patternsdesign.behavioral.iterator;

import oop.patternsdesign.behavioral.iterator.iterator.ProfileIterator;

public interface SocialNetwork {
	
	ProfileIterator createFriendsIterator(String profileEmail);
	ProfileIterator createCoworkersIterator(String profileEmail);

}
