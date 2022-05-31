package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ComputerPartVisitor;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);
	
}
