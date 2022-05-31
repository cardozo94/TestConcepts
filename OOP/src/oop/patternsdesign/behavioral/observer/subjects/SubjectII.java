package oop.patternsdesign.behavioral.observer.subjects;

import oop.patternsdesign.behavioral.observer.observers.ObserverII;

public interface SubjectII {
	
	public void registerObserver(ObserverII o);
	public void unregisterOberver(ObserverII o);
	public void notifyObservers();

}
