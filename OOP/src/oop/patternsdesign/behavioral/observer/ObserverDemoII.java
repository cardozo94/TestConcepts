package oop.patternsdesign.behavioral.observer;

import oop.patternsdesign.behavioral.observer.observers.Gates;
import oop.patternsdesign.behavioral.observer.observers.Lighting;
import oop.patternsdesign.behavioral.observer.observers.Surveillance;
import oop.patternsdesign.behavioral.observer.subjects.SensorSystem;

public class ObserverDemoII {

	public static void main(String[] args) {
		SensorSystem sensorSys = new SensorSystem();
		sensorSys.register(new Gates());
		sensorSys.register(new Lighting());
		sensorSys.register(new Surveillance());
		sensorSys.soundTheAlarm();
	}

}
