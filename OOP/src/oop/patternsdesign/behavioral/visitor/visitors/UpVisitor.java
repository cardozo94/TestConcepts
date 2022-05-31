package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.BAR;
import oop.patternsdesign.behavioral.visitor.elements.BAZ;
import oop.patternsdesign.behavioral.visitor.elements.FOO;

public class UpVisitor implements Visitor {

	@Override
	public void visit(FOO foo) {
		System.out.println("do Up on "+foo.getFOO());

	}

	@Override
	public void visit(BAR bar) {
		System.out.println("do Up on "+bar.getBAR());
	}

	@Override
	public void visit(BAZ baz) {
		System.out.println("do Up on "+baz.getBAZ());
	}

}
