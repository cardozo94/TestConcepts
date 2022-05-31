package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.Book;
import oop.patternsdesign.behavioral.visitor.elements.Fruit;

public interface ShoppingCartVisitor {
	
	int visit(Book book);
	int visit(Fruit fruit);

}
