package oop.patternsdesign.behavioral.observer.subjects;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.observer.observers.Observer;

public class Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public void add(Observer o) {
		observers.add(o);
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int value) {
		this.state = value;
		execute();
	}
	
	private void execute() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
