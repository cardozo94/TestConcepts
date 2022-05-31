package oop.patternsdesign.behavioral.visitor;

import oop.patternsdesign.behavioral.visitor.elements.Book;
import oop.patternsdesign.behavioral.visitor.elements.Fruit;
import oop.patternsdesign.behavioral.visitor.elements.ItemElement;
import oop.patternsdesign.behavioral.visitor.visitors.ShoppingCartVisitoImpl;
import oop.patternsdesign.behavioral.visitor.visitors.ShoppingCartVisitor;

public class ShoppingCartClient {
	
	//This example is base on /OOP/resources/behavioral/Visitor-Design-Pattern-Diagram.png
	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book(20, "1234"), new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	
	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitoImpl();
		int sum=0;
		for (ItemElement item : items) {
			sum = sum + item.acept(visitor);
		}
		return sum;
	}
}
