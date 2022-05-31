package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.This;

public class UpVisitorI extends ReflectiveVisitor {

	@Override
	public void visit(Object o) {
		try {
			getMethod(o.getClass()).invoke(this, o);
		} catch (Exception e) {
			System.out.println("UpVisitor - no appropiate visit() method");
		}
	}
	
	public void visitThis(This element) {
		System.out.println("UpVisitor: do Up on "+element.thiss());
	}
	
	public void visitObject() {
		System.out.println("UpVisitor: generic visitObjet() method");
	}
}
