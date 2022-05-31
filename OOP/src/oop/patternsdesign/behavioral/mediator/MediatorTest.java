package oop.patternsdesign.behavioral.mediator;

import oop.patternsdesign.behavioral.mediator.components.Button;
import oop.patternsdesign.behavioral.mediator.components.Fan;
import oop.patternsdesign.behavioral.mediator.components.PowerSupplier;

public class MediatorTest {

	//This example is base on /OOP/resources/behavioral/mediator.webp
	public static void main(String[] args) {
		Button button = new Button();
		Fan fan = new Fan();
		PowerSupplier powerSupplier = new PowerSupplier();
		MediatorII mediator = new MediatorII();
		
		button.setMediator(mediator);
		fan.setMediator(mediator);
		mediator.setButton(button);
		mediator.setFan(fan);
		mediator.setPowerSuplier(powerSupplier);
		
		System.out.println(fan.isOn());
		button.press();
		System.out.println(fan.isOn());
		button.press();
		System.out.println(fan.isOn());

	}

}
