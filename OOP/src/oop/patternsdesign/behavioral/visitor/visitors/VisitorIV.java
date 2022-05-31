package oop.patternsdesign.behavioral.visitor.visitors;

import oop.patternsdesign.behavioral.visitor.elements.Circle;
import oop.patternsdesign.behavioral.visitor.elements.CompoundShape;
import oop.patternsdesign.behavioral.visitor.elements.Dot;
import oop.patternsdesign.behavioral.visitor.elements.Rectangle;

public interface VisitorIV {

	String visitDot(Dot dot);

	String visitCircle(Circle circle);

	String visitRectangle(Rectangle rectangle);

	String visitCompound(CompoundShape cg);

}
