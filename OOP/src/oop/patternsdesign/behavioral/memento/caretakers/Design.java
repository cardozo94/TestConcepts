package oop.patternsdesign.behavioral.memento.caretakers;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.memento.originators.Life;

public class Design {

	public static void main(String[] args) {
		List<Life.Memento> savedTimes = new ArrayList<Life.Memento>();
		Life life = new Life();
		
		life.set("1000 B.C.");
		savedTimes.add(life.saveToMemento());
		life.set("1000 A.D.");
		savedTimes.add(life.saveToMemento());
		life.set("2000 A.D.");
		savedTimes.add(life.saveToMemento());
		life.set("4000 A.D.");
		
		life.restoreFromMemento(savedTimes.get(1));
	}

}
