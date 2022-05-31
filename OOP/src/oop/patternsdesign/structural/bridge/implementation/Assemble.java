package oop.patternsdesign.structural.bridge.implementation;

public class Assemble implements Workshop {

	@Override
	public void work() {
		System.out.println(" And Assembled.");
	}

}
