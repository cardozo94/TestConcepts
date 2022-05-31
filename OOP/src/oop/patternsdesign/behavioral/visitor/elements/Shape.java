package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorIV;

public interface Shape {
	
	void move(int x, int y);
	void draw();
	String accept(VisitorIV visitor);
}
