package oop.patternsdesign.structural.decorator.core;

import oop.patternsdesign.structural.decorator.lcdinterface.Widget;

//3. "Core" class with "is a" relationship
public class TextField implements Widget {
	
	private int width, height;
	
	public TextField(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("TextField: "+width+", "+height);
	}

}
