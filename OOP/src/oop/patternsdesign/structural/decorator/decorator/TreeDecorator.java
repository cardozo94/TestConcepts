package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.ChristmasTree;

public abstract class TreeDecorator implements ChristmasTree {
	
	private ChristmasTree tree;

	public TreeDecorator(ChristmasTree tree) {
		this.tree = tree;
	}

	@Override
	public String decorate() {
		return tree.decorate();
	}

}
