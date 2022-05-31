package org.camcar.springtutorial.xmlconfig;

public class Point implements Shape{

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void draw() {
		System.out.println("Point is drawing at ("+getX()+", "+getY()+")");
		
	}	
	
}
