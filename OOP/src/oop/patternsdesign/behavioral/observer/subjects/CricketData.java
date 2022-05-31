package oop.patternsdesign.behavioral.observer.subjects;

import java.util.ArrayList;
import java.util.Iterator;

import oop.patternsdesign.behavioral.observer.observers.ObserverII;

public class CricketData implements SubjectII {
	
	int runs;
	int wickets;
	float overs;
	ArrayList<ObserverII> observers;
	
	public CricketData() {
		observers = new ArrayList<ObserverII>();
	}

	@Override
	public void registerObserver(ObserverII o) {
		observers.add(o);
	}

	@Override
	public void unregisterOberver(ObserverII o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Iterator<ObserverII> it = observers.iterator(); it.hasNext();) {
			ObserverII observer = (ObserverII) it.next();
			observer.update(runs, wickets, overs);
		}
	}
	
	private int getLastestRuns() {
		return 90;
	}
	
	private int getLastestWickets() {
		return 2;
	}
	
	private float getLastestOvers() {
		return (float)10.2;
	}

	public void dataChanged() {
		runs = getLastestRuns();
		wickets = getLastestWickets();
		overs = getLastestOvers();
		
		notifyObservers();
	}
}
