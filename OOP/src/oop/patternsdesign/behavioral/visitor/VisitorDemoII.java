package oop.patternsdesign.behavioral.visitor;

import java.util.UUID;

import oop.patternsdesign.behavioral.visitor.elements.Document;
import oop.patternsdesign.behavioral.visitor.elements.JsonElement;
import oop.patternsdesign.behavioral.visitor.elements.XmlElement;
import oop.patternsdesign.behavioral.visitor.visitors.ElementVisitor;
import oop.patternsdesign.behavioral.visitor.visitors.VisitorII;

public class VisitorDemoII {

	private static String generateUuid() {
		return UUID.randomUUID().toString();
	}
	
	//This example is base on /OOP/resources/behavioral/Visitor-UML.png
	public static void main(String[] args) {
		VisitorII v = new ElementVisitor();
		
		Document d = new Document(generateUuid());
		d.elements.add(new JsonElement(generateUuid()));
		d.elements.add(new JsonElement(generateUuid()));
		d.elements.add(new XmlElement(generateUuid()));
		d.accept(v);
	}

}
