package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.BAR;
import oop.patternsdesign.behavioral.visitor.elements.BAZ;
import oop.patternsdesign.behavioral.visitor.elements.FOO;

public class DownVisitor implements Visitor {

	@Override
	public void visit(FOO foo) {
		System.out.println("do Down on "+foo.getFOO());

	}

	@Override
	public void visit(BAR bar) {
		System.out.println("do Down on "+bar.getBAR());
	}

	@Override
	public void visit(BAZ baz) {
		System.out.println("do Down on "+baz.getBAZ());
	}

}
