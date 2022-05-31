package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.I;

public class Y extends D {

	public Y(I inner) {
		super(inner);
	}
	
	public void doIt() {
		super.doIt();
		doY();
	}
	
	private void doY() {
		System.out.print("Y");
	}

}
