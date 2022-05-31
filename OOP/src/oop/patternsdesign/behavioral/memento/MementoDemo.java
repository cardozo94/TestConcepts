package oop.patternsdesign.behavioral.memento;

import oop.patternsdesign.behavioral.memento.caretakers.Caretaker;
import oop.patternsdesign.behavioral.memento.originators.Originator;

public class MementoDemo {
	
	//This example is base on /OOP/resources/behavioral/memento_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Caretaker carataker = new Caretaker();
		Originator originator = new Originator();
		originator.setState("State1");
		originator.setState("State2");
		carataker.addMemento(originator.save());
		originator.setState("State3");
		carataker.addMemento(originator.save());
		originator.setState("State4");
		originator.restore(carataker.getMemento());
	}

}
