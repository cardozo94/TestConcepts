package oop.patternsdesign.structural.bridge;

import oop.patternsdesign.structural.bridge.abstraction.Circle;
import oop.patternsdesign.structural.bridge.abstraction.Shape;
import oop.patternsdesign.structural.bridge.implementation.GreenCircle;
import oop.patternsdesign.structural.bridge.implementation.RedCircle;

public class BridgePatternDemo {
	
	//This example is base on /OOP/resources/structural/bridge_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greencircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greencircle.draw();
	}

}
