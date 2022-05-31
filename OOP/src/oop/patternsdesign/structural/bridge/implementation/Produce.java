package oop.patternsdesign.structural.bridge.implementation;

public class Produce implements Workshop {

	@Override
	public void work() {
		System.out.print("Produced");
	}

}
