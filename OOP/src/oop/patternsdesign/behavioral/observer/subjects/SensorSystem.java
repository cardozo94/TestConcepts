package oop.patternsdesign.behavioral.observer.subjects;

import java.util.Enumeration;
import java.util.Vector;

import oop.patternsdesign.behavioral.observer.observers.AlarmListener;

public class SensorSystem {
	
	private Vector<AlarmListener> listeners = new Vector<AlarmListener>();
	
	public void register(AlarmListener alarmListener) {
		listeners.addElement(alarmListener);
	}
	
	public void soundTheAlarm() {
		for (Enumeration<AlarmListener> e = listeners.elements(); e.hasMoreElements();) {
			((AlarmListener) e.nextElement()).alarm();
		}
	}
}
