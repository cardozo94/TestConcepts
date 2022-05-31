package oop.patternsdesign.structural.decorator.decorator;

import oop.patternsdesign.structural.decorator.lcdinterface.Widget;

//2. Second level base class with "is a" relationship
public abstract class DecoratorIII implements Widget {

	// 4. "has a" relationship
	private Widget widget;
	
	public DecoratorIII(Widget widget) {
		this.widget = widget;
	}
	
	@Override
	public void draw() {
		widget.draw();  // 5. Delegation
	}

}
