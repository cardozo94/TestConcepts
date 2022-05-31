package oop.patternsdesign.behavioral.command;

import oop.patternsdesign.behavioral.command.command.OpenTextFileOperation;
import oop.patternsdesign.behavioral.command.command.SaveTextFileOperation;
import oop.patternsdesign.behavioral.command.invoker.TextFileOperationExecutor;
import oop.patternsdesign.behavioral.command.receiver.TextFile;

public class Client {

	public static void main(String[] args) {
		TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
		String file1 =textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
		String file2 = textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
		System.out.println(file1);
		System.out.println(file2);
	}

}
