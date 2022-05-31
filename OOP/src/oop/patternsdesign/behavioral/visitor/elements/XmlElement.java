package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorII;

public class XmlElement extends ElementII {

	public XmlElement(String uuid) {
		super(uuid);
	}

	@Override
	public void accept(VisitorII v) {
		v.visit(this);		
	}

}
