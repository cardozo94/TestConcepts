package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.JsonElement;
import oop.patternsdesign.behavioral.visitor.elements.XmlElement;

public class ElementVisitor implements VisitorII {

	@Override
	public void visit(XmlElement xe) {
		System.out.println("processing xml element with uuid"+xe.uuid);	
	}

	@Override
	public void visit(JsonElement je) {
		System.out.println("processing json element with uuid"+je.uuid);		
	}


}
