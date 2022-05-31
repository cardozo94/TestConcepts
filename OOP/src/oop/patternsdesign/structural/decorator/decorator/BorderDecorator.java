package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.Widget;

//6. Optional embellishment
public class BorderDecorator extends DecoratorIII {

	public BorderDecorator(Widget widget) {
		super(widget);
	}
	
	public void draw() {
		super.draw(); // 7. Delegate to base class and add extra stuff
		System.out.println("	BorderDecorator");
	}

}
