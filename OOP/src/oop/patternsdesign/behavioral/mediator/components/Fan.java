package oop.patternsdesign.behavioral.mediator.components;

import oop.patternsdesign.behavioral.mediator.MediatorII;

public class Fan {

	private MediatorII mediator;
	public void setMediator(MediatorII mediator) {
		this.mediator = mediator;
	}

	private boolean isOn = false;
	
	public boolean isOn() {
		return isOn;
	}

	public void turnOn() {
		mediator.start();
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
		mediator.stop();
	}
}
