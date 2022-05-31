package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.Editor;

public abstract class CommandEditor {
	
	public Editor editor;
	private String backup;
	
	public CommandEditor(Editor editor) {
		this.editor = editor;
	}
	
	public void backup() {
		backup = editor.textField.getText();
	}
	
	public void undo() {
		editor.textField.setText(backup);
	}
	
	public abstract boolean execute();

}
