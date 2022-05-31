package oop.patternsdesign.behavioral.mediator;

import oop.patternsdesign.behavioral.mediator.components.Button;
import oop.patternsdesign.behavioral.mediator.components.Fan;
import oop.patternsdesign.behavioral.mediator.components.PowerSupplier;

public class MediatorII {
	
	private Button button;
	private Fan fan;
	private PowerSupplier powerSuplier;
	
	public void setButton(Button button) {
		this.button = button;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}

	public void setPowerSuplier(PowerSupplier powerSuplier) {
		this.powerSuplier = powerSuplier;
	}
	
	public void press() {
		if(fan.isOn())
			fan.turnOff();
		else
			fan.turnOn();
	}
	
	public void start() {
		powerSuplier.turnOn();
	}
	
	public void stop() {
		powerSuplier.turnOff();
	}

}
