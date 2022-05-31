package oop.patternsdesign.behavioral.visitor;


import oop.patternsdesign.behavioral.visitor.elements.BAR;
import oop.patternsdesign.behavioral.visitor.elements.BAZ;
import oop.patternsdesign.behavioral.visitor.elements.Element;
import oop.patternsdesign.behavioral.visitor.elements.FOO;
import oop.patternsdesign.behavioral.visitor.visitors.DownVisitor;
import oop.patternsdesign.behavioral.visitor.visitors.UpVisitor;

public class VisitorDemo {

	public static void main(String[] args) {
		Element[] list = {new FOO(), new BAR(), new BAZ()};
		UpVisitor up = new UpVisitor();
		DownVisitor down = new DownVisitor();
		for (Element element : list) {
			element.accept(up);
		}
		for (Element element : list) {
			element.accept(down);
		}
	}

}
