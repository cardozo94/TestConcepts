package oop.patternsdesign.structural.bridge;

import oop.patternsdesign.structural.bridge.abstraction.Bike;
import oop.patternsdesign.structural.bridge.abstraction.Car;
import oop.patternsdesign.structural.bridge.abstraction.Vehicle;
import oop.patternsdesign.structural.bridge.implementation.Assemble;
import oop.patternsdesign.structural.bridge.implementation.Produce;

public class BridgePattern {

	//This example is base on /OOP/resources/structural/BridgeDesign3.png
	public static void main(String[] args) {
		Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();
		
	}

}
