package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorII;

public class JsonElement extends ElementII {

	public JsonElement(String uuid) {
		super(uuid);
	}

	@Override
	public void accept(VisitorII v) {
		v.visit(this);		
	}

}
