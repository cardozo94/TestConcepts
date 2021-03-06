package oop.patternsdesign.structural.decorator;

import oop.patternsdesign.structural.decorator.core.TextField;
import oop.patternsdesign.structural.decorator.decorator.BorderDecorator;
import oop.patternsdesign.structural.decorator.decorator.ScrollDecorator;
import oop.patternsdesign.structural.decorator.lcdinterface.Widget;

/*
 * 1. Create a "lowest common denominator" that makes classes interchangeable
 * 2. Create a second level base class for optional functionality
 * 3. "Core" class and "Decorator" class declare an "isa" relationship
 * 4. Decorator class "has a" instance of the "lowest common denominator"
 * 5. Decorator class delegates to the "has a" object
 * 6. Create a Decorator derived class for each optional embellishment
 * 7. Decorator derived classes delegate to base class AND add extra stuff
 * 8. Client has the responsibility to compose desired configurations
*/
public class DecoratorDemoIII {
	
	public static void main(String[] args) {
		Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24)))); // 8. Client has the responsibility to compose desired configurations
		widget.draw();
	}

}
