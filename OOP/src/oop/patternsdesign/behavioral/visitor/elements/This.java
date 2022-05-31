package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ReflectiveVisitor;

public class This implements ElementI {

	@Override
	public void accept(ReflectiveVisitor v) {
		v.visit(this);		
	}
	
	public String thiss() {
		return "This";
	}
}
