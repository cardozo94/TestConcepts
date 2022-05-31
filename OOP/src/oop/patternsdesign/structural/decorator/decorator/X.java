package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.I;

public class X extends D {

	public X(I inner) {
		super(inner);
	}
	
	public void doIt() {
		super.doIt();
		doX();
	}
	
	private void doX() {
		System.out.print("X");
	}

}
