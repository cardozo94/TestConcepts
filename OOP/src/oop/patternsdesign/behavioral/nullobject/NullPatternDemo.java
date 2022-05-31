package oop.patternsdesign.behavioral.nullobject;

import oop.patternsdesign.behavioral.nullobject.strategy.AbstractCustomer;

public class NullPatternDemo {

	//This example is base on /OOP/resources/behavioral/null_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

		System.out.println("Customers");
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());

	}

}
