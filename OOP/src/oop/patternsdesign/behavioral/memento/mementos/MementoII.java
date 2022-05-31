package oop.patternsdesign.behavioral.memento.mementos;

import oop.patternsdesign.behavioral.memento.editor.Editor;

public class MementoII {
	
	private String backup;
	private Editor editor;
	
	public MementoII(Editor editor) {
		this.editor = editor;
		this.backup = editor.backup();
	}
	
	public void restore() {
		editor.restore(backup);
	}

}
