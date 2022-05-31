package org.camcar.springtutorial.xmlconfig;

public class Circle implements Shape {

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle drawn with center in point (" +getCenter().getX()+", "+getCenter().getY()+").");

	}
}
