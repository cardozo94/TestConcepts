package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.I;

public abstract class D implements I {
	
	private I core;
	
	public D(I inner) {
		core =inner;
	}

	@Override
	public void doIt() {
		core.doIt();
	}

}
