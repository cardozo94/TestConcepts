package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.JsonElement;
import oop.patternsdesign.behavioral.visitor.elements.XmlElement;

public interface VisitorII {
	
	void visit(XmlElement xe);
	void visit(JsonElement je);
	
}
