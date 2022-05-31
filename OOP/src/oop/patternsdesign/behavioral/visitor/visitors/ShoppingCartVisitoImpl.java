package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.Book;
import oop.patternsdesign.behavioral.visitor.elements.Fruit;

public class ShoppingCartVisitoImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		int cost = 0;
		if(book.getPrice() > 50)
			cost = book.getPrice()-5;
		else
			cost = book.getPrice();
		System.out.println("Book ISBN::"+book.getIsbnNumber()+" cost = "+cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg()*fruit.getWeight();
		System.out.println(fruit.getName()+" cost = "+cost);
		return cost;
	}

}