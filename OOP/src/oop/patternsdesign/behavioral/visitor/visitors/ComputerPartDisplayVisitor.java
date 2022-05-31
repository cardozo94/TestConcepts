package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.Computer;
import oop.patternsdesign.behavioral.visitor.elements.Keyboard;
import oop.patternsdesign.behavioral.visitor.elements.Monitor;
import oop.patternsdesign.behavioral.visitor.elements.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displating Monitor");
	}

}
