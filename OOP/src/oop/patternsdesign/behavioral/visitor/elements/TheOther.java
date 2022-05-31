package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ReflectiveVisitor;

public class TheOther implements ElementI {

	@Override
	public void accept(ReflectiveVisitor v) {
		v.visit(this);
	}

	public String theOther() {
		return "TheOther";
	}
}
