package oop.patternsdesign.structural.decorator;

import oop.patternsdesign.structural.decorator.core.ChristmasTreeImpl;
import oop.patternsdesign.structural.decorator.decorator.BubbleLights;
import oop.patternsdesign.structural.decorator.decorator.Garland;
import oop.patternsdesign.structural.decorator.lcdinterface.ChristmasTree;

public class DecoratorDemoIV {
	
	//This example is base on /OOP/resources/structural/8poz64T.jpg
	public static void main(String[] args) {
		ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
		System.out.println(tree1.decorate());
		ChristmasTree tree2 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
		System.out.println(tree2.decorate());
	}

}
