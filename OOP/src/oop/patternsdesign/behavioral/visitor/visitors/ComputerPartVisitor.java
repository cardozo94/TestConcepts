package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.Computer;
import oop.patternsdesign.behavioral.visitor.elements.Keyboard;
import oop.patternsdesign.behavioral.visitor.elements.Monitor;
import oop.patternsdesign.behavioral.visitor.elements.Mouse;

public interface ComputerPartVisitor {

	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
