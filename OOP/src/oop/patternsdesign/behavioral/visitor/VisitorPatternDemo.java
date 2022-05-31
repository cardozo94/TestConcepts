package oop.patternsdesign.behavioral.visitor;

import oop.patternsdesign.behavioral.visitor.elements.Computer;
import oop.patternsdesign.behavioral.visitor.elements.ComputerPart;
import oop.patternsdesign.behavioral.visitor.visitors.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
	
	//This example is base on /OOP/resources/behavioral/visitor_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
