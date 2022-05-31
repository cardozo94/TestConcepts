package oop.patternsdesign.structural.decorator.core;

import oop.patternsdesign.structural.decorator.lcdinterface.ChristmasTree;

public class ChristmasTreeImpl implements ChristmasTree {

	@Override
	public String decorate() {
		return "Christmas tree";
	}

}
