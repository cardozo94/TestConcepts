package oop.patternsdesign.behavioral.memento.mementos;

public class Memento {

	private String state;
	
	public String getState() {
		return state;
	}

	public Memento(String state) {
		this.state = state;
	}
}
