package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.Visitor;

public class FOO implements Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public String getFOO() {
		return "FOO";
	}

}
