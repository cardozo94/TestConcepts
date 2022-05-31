package oop.patternsdesign.structural.decorator;

import oop.patternsdesign.structural.decorator.core.A;
import oop.patternsdesign.structural.decorator.decorator.X;
import oop.patternsdesign.structural.decorator.decorator.Y;
import oop.patternsdesign.structural.decorator.decorator.Z;
import oop.patternsdesign.structural.decorator.lcdinterface.I;

public class DecoratorDemo {

	public static void main(String[] args) {
		I[] array = { new X(new A()), new Y(new X(new A())), new Z(new Y(new X(new A()))) };
		
		for (I anArray : array) {
			anArray.doIt();
			System.out.print(" ");
		}

	}

}
