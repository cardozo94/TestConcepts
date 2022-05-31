package oop.patternsdesign.behavioral.iterator.iterator;

import oop.patternsdesign.behavioral.iterator.Profile;

public interface ProfileIterator {
	
	boolean hasNext();
	Profile getNext();
	void reset();
}
