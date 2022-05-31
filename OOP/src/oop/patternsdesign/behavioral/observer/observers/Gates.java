package oop.patternsdesign.behavioral.observer.observers;

public class Gates implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("gates close");
	}

}
