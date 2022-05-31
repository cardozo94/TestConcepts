package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.TextFile;

public class OpenTextFileOperation implements TextFileOperation {
	
	private TextFile textFile;
	
	public OpenTextFileOperation(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.open();
	}

}
