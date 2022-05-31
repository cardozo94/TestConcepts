package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.Editor;

public class CutCommand extends CommandEditor {

	public CutCommand(Editor editor) {
		super(editor);
	}

	@Override
	public boolean execute() {
		if(editor.textField.getSelectedText().isEmpty())
			return false;
		backup();
		String source = editor.textField.getText();
		editor.clipboard = editor.textField.getSelectedText();
		editor.textField.setText(cutString(source));
		return true;
	}

	private String cutString(String source) {
		String start = source.substring(0, editor.textField.getSelectionStart());
		String end = source.substring(editor.textField.getSelectionEnd());
		return start+end;
	}
}
