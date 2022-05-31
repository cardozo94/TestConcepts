package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.Widget;

//6. Optional embellishment
public class ScrollDecorator extends DecoratorIII {

	public ScrollDecorator(Widget widget) {
		super(widget);
	}
	
	public void draw() {
		super.draw(); // 7. Delegate to base class and add extra stuff
		System.out.println("	ScrollDecorator");
	}

}
