package oop.patternsdesign.behavioral.memento.originators;

import oop.patternsdesign.behavioral.memento.mementos.TextWindowState;

public class TextWindow {

	private StringBuilder currentText;
	
	public StringBuilder getCurrentText() {
		return currentText;
	}

	public TextWindow() {
		this.currentText= new StringBuilder();
	}
	
	public void addText(String text) {
		currentText.append(text);
	}
	
	public TextWindowState save() {
		return new TextWindowState(currentText.toString());
	}
	
	public void restore(TextWindowState save) {
		currentText = new StringBuilder(save.getText());
	}
}
