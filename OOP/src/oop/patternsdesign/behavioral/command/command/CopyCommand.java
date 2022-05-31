package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.Editor;

public class CopyCommand extends CommandEditor {
	
	

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		editor.clipboard = editor.textField.getSelectedText();
		return true;
	}

}
