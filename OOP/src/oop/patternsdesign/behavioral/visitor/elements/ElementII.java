package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorII;

public abstract class ElementII {
	
	public String uuid;
	
	public ElementII(String uuid) {
		this.uuid = uuid;
	}
	
	public abstract void accept(VisitorII v);
	
}
