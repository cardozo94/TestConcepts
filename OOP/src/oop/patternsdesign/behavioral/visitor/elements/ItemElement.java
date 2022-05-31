package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ShoppingCartVisitor;

public interface ItemElement {

	public int acept(ShoppingCartVisitor visitor);
	
}
