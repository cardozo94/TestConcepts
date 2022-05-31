package oop.patternsdesign.behavioral.memento.caretakers;

import oop.patternsdesign.behavioral.memento.mementos.TextWindowState;
import oop.patternsdesign.behavioral.memento.originators.TextWindow;

public class TextEditor {

	private TextWindow textWindow;
	private TextWindowState savedTextWindow;

	public TextEditor(TextWindow textWindow) {
		this.textWindow = textWindow;
	}
	
	public void write(String text) {
		textWindow.addText(text);
	}
	
	public String print() {
		return textWindow.getCurrentText().toString();
	}
	
	public void hitSave() {
		savedTextWindow= textWindow.save();
	}
	
	public void hitUndo() {
		textWindow.restore(savedTextWindow);
	}
}
