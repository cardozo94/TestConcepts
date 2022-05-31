package oop.patternsdesign.behavioral.visitor.elements;

import oop.patternsdesign.behavioral.visitor.visitors.ShoppingCartVisitor;

public class Fruit implements ItemElement {
	
	private int pricePerKg;
	private int weight;
	private String name;
	
	public Fruit(int pricePerKg, int weight, String name) {
		this.pricePerKg = pricePerKg;
		this.weight = weight;
		this.name = name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	@Override
	public int acept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
