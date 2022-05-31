package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.Visitor;

public interface Element {

	void accept(Visitor v);
	
}
