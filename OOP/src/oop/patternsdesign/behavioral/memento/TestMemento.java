package oop.patternsdesign.behavioral.memento;

import oop.patternsdesign.behavioral.memento.caretakers.TextEditor;
import oop.patternsdesign.behavioral.memento.originators.TextWindow;

public class TestMemento {

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor(new TextWindow());
		textEditor.write("The Memento Design Patter\n");
		textEditor.write("How to implement it in Java?\n");
		textEditor.hitSave();
		
		textEditor.write("Buy milk and eggs before coming home\n");
		
		textEditor.hitUndo();
		System.out.println(textEditor.print());
	}
}
