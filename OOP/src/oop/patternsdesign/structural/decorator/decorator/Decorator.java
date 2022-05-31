package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.LCD;

public class Decorator implements LCD {
	
	private LCD inner;
	
	public Decorator(LCD inner) {
		this.inner = inner;
	}

	@Override
	public void write(String[] s) {
		inner.write(s);
	}

	@Override
	public void read(String[] s) {
		inner.read(s);
	}

}
