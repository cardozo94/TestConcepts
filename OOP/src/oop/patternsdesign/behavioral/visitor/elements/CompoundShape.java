package oop.patternsdesign.behavioral.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorIV;

public class CompoundShape implements Shape {

	public int id;
	public List<Shape> children = new ArrayList<Shape>();
	
	public CompoundShape(int id) {
		this.id = id;
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
		return visitor.visitCompound(this);
	}
	
	public void add(Shape shape) {
		children.add(shape);
	}

	public int getId() {
		return id;
	}

}
