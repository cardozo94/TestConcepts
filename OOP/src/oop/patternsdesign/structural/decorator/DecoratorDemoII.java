package oop.patternsdesign.structural.decorator;

import oop.patternsdesign.structural.decorator.core.Core;
import oop.patternsdesign.structural.decorator.decorator.Scramble;
import oop.patternsdesign.structural.decorator.decorator.Validation;
import oop.patternsdesign.structural.decorator.lcdinterface.LCD;

public class DecoratorDemoII {
	
	public static void main(String[] args) {
		LCD stream = new Validation(new Scramble(new Core()));
		String[] str = {""};
		stream.write(str);
		System.out.println("main:	"+str[0]);
		stream.read(str);
	}

}
