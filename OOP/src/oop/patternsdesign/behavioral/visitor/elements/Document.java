package oop.patternsdesign.behavioral.visitor.elements;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.visitor.visitors.VisitorII;

public class Document extends ElementII {
	
	public List<ElementII> elements = new ArrayList<ElementII>();
	
	public Document(String uuid) {
		super(uuid);
	}

	@Override
	public void accept(VisitorII v) {
		for (ElementII element : elements) {
			element.accept(v);
		}		
	}
}
