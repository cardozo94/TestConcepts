package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.BAR;
import oop.patternsdesign.behavioral.visitor.elements.BAZ;
import oop.patternsdesign.behavioral.visitor.elements.FOO;

public interface Visitor {

	void visit(FOO foo);
	void visit(BAR bar);
	void visit(BAZ baz);
}
