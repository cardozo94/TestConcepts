package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorIV;

public class Dot implements Shape {
	
	private int id;
	private int x;
	private int y;
	
	public Dot() {}
	
	public Dot(int id, int x, int y) {
		this.id = id;
		this.x = x;
		this.y = y;
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}

	@Override
	public String accept(VisitorIV visitor) {
		return visitor.visitDot(this);
	}

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
