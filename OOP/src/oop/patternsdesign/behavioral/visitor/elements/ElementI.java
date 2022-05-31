package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ReflectiveVisitor;

public interface ElementI {
	
	void accept(ReflectiveVisitor v);

}
