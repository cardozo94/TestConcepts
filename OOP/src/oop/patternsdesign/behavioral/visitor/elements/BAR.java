package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.Visitor;

public class BAR implements Element {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public String getBAR() {
		return "BAR";
	}

}
