package oop.patternsdesign.behavioral.visitor;

import oop.patternsdesign.behavioral.visitor.elements.Circle;
import oop.patternsdesign.behavioral.visitor.elements.CompoundShape;
import oop.patternsdesign.behavioral.visitor.elements.Dot;
import oop.patternsdesign.behavioral.visitor.elements.Rectangle;
import oop.patternsdesign.behavioral.visitor.elements.Shape;
import oop.patternsdesign.behavioral.visitor.visitors.XMLExportVisitor;

public class Demo {
	private static void export(Shape...shapes) {
		XMLExportVisitor exportVisitor = new XMLExportVisitor();
		System.out.println(exportVisitor.export(shapes));
	}

	public static void main(String[] args) {
		Dot dot = new Dot(1, 10, 55);
		Circle circle = new Circle(2, 23, 15, 10);
		Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);
		
		CompoundShape compoundShape = new CompoundShape(4);
		compoundShape.add(dot);
		compoundShape.add(circle);
		compoundShape.add(rectangle);
		
		CompoundShape c = new CompoundShape(5);
		c.add(dot);
		compoundShape.add(c);
		
		export(circle, compoundShape);

	}

}
