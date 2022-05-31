package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.That;

public class DownVisitorI extends ReflectiveVisitor{

	@Override
	public void visit(Object o) {
		try {
			getMethod(o.getClass()).invoke(this, o);
		} catch (Exception e) {
			System.out.println("DownVisitor - no appropiate visit() method");
		}
	}
	
	public void visitThis(That element) {
		System.out.println("DownVisitor: do Up on "+element.that());
	}
}
