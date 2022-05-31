package oop.patternsdesign.structural.decorator;

import oop.patternsdesign.structural.decorator.core.Circle;
import oop.patternsdesign.structural.decorator.core.Rectangle;
import oop.patternsdesign.structural.decorator.decorator.RedShapeDecorator;
import oop.patternsdesign.structural.decorator.lcdinterface.Shape;

public class DecoratorPatterDemo {

	//This example is base on /OOP/resources/structural/decorator_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Shape circle = new Circle();
		
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		circle.draw();
		System.out.println("\nCircle of red border");
		redCircle.draw();
		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

}
