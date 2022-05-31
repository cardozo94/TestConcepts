package oop.patternsdesign.structural.decorator.core;

import oop.patternsdesign.structural.decorator.lcdinterface.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Circle");
		}

}
