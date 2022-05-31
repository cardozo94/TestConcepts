package oop.patternsdesign.structural.bridge.abstraction;

import oop.patternsdesign.structural.bridge.implementation.DrawAPI;

public class Circle extends Shape {
	
	private int x, y, radius;

	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
