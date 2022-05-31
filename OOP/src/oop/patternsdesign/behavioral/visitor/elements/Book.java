package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ShoppingCartVisitor;

public class Book implements ItemElement {
	
	private int price;
	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	private String isbnNumber;
	
	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	@Override
	public int acept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
