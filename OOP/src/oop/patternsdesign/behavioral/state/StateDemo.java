package oop.patternsdesign.behavioral.state;

import oop.patternsdesign.behavioral.state.contexts.Package;

public class StateDemo {

	//This example is base on /OOP/resources/behavioral/State-1.png
	public static void main(String[] args) {
		Package pkg = new Package();
		pkg.printStatus();
		
		pkg.nextState();
		pkg.printStatus();
		
		pkg.nextState();
		pkg.printStatus();
		
		pkg.nextState();
		pkg.printStatus();
	}

}
