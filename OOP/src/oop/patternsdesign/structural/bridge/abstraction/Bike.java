package oop.patternsdesign.structural.bridge.abstraction;

import oop.patternsdesign.structural.bridge.implementation.Workshop;

public class Bike extends Vehicle {

	public Bike(Workshop workShop1, Workshop workShop2) {
		super(workShop1, workShop2);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		workShop1.work();
		workShop2.work();
	}

}
