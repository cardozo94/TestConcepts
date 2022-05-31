package oop.patternsdesign.structural.bridge.abstraction;

import oop.patternsdesign.structural.bridge.implementation.DrawAPI;

public abstract class Shape {
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();

}
