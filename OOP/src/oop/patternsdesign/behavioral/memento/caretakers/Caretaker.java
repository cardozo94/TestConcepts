package oop.patternsdesign.behavioral.memento.caretakers;

import java.util.ArrayList;

import oop.patternsdesign.behavioral.memento.mementos.Memento;

public class Caretaker {
	
	private ArrayList<Memento> mementos = new ArrayList<Memento>();
	
	public void addMemento(Memento m) {
		mementos.add(m);
	}
	
	public Memento getMemento() {
		return mementos.get(1);
	}

}
