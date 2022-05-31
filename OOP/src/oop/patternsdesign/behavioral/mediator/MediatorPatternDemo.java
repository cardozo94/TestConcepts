package oop.patternsdesign.behavioral.mediator;

import oop.patternsdesign.behavioral.mediator.components.User;

public class MediatorPatternDemo {

	//This example is base on /OOP/resources/behavioral/mediator_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}

}
