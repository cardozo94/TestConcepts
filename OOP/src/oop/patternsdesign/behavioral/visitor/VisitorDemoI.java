package oop.patternsdesign.behavioral.visitor;

import oop.patternsdesign.behavioral.visitor.elements.ElementI;
import oop.patternsdesign.behavioral.visitor.elements.That;
import oop.patternsdesign.behavioral.visitor.elements.TheOther;
import oop.patternsdesign.behavioral.visitor.elements.This;
import oop.patternsdesign.behavioral.visitor.visitors.DownVisitorI;
import oop.patternsdesign.behavioral.visitor.visitors.UpVisitorI;

public class VisitorDemoI {

	public static void main(String[] args) {
		ElementI[] list = {new This(), new That(), new TheOther()};
		UpVisitorI up = new UpVisitorI();
		DownVisitorI down = new DownVisitorI();
		for (ElementI element : list) {
			element.accept(up);
		}
		for (ElementI element : list) {
			element.accept(down);
		}
	}

}
