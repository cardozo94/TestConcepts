package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.Editor;

public class PasteCommand extends CommandEditor {

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if(editor.clipboard == null || editor.clipboard.isEmpty())
			return false;
		backup();
		editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
		return true;
	}

}
