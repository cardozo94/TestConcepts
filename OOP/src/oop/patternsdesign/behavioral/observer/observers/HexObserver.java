package oop.patternsdesign.behavioral.observer.observers;

import oop.patternsdesign.behavioral.observer.subjects.Subject;

public class HexObserver extends Observer {
	
	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" "+Integer.toHexString(subject.getState()));
	}

}
