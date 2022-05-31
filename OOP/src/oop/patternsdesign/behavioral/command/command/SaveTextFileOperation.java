package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation {

	private TextFile textFile;
	
	public SaveTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}
	
	@Override
	public String execute() {
		return textFile.save();
	}

}
