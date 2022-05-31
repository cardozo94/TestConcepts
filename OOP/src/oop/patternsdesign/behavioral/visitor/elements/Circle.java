package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorIV;

public class Circle extends Dot {
	
	private int radius;
	
	public Circle(int id, int x, int y, int radius) {
		super(id, x, y);
		this.radius = radius;
	}
	
	@Override 
	public String accept(VisitorIV visitor){
		return visitor.visitCircle(this);
	}

	public int getRadius() {
		return radius;
	}
	
}
