package oop.patternsdesign.behavioral.observer.observers;

import oop.patternsdesign.behavioral.observer.subjects.Subject;

public abstract class Observer {

	protected Subject subject;
	public abstract void update();
	
}
