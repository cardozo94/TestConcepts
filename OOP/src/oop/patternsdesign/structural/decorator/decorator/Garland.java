package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.ChristmasTree;

public class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
	}
	
	public String decorate() {
		return super.decorate()+ decorateWithGarland();
	}
	
	public String decorateWithGarland() {
		return " with Garland";
	}

}
