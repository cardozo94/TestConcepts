package oop.patternsdesign.behavioral.command.invoker;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.command.command.TextFileOperation;

public class TextFileOperationExecutor {
	
	private final List<TextFileOperation> textFileOperations = new ArrayList<TextFileOperation>();
	
	public String executeOperation(TextFileOperation textFileOperation) {
		textFileOperations.add(textFileOperation);
		return textFileOperation.execute();
	}

}
