package oop.patternsdesign.behavioral.observer.observers;

public class Lighting implements AlarmListener {

	@Override
	public void alarm() {
		System.out.println("lights up");
	}

}
