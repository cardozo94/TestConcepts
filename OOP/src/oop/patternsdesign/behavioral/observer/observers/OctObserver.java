package oop.patternsdesign.behavioral.observer.observers;

import oop.patternsdesign.behavioral.observer.subjects.Subject;

public class OctObserver extends Observer {

	public OctObserver(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {
		System.out.print(" "+Integer.toOctalString(subject.getState()));
	}

}
