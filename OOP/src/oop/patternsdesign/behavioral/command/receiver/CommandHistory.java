package oop.patternsdesign.behavioral.command.receiver;

import java.util.Stack;

import oop.patternsdesign.behavioral.command.Command;
import oop.patternsdesign.behavioral.command.command.CommandEditor;

public class CommandHistory {
	
	private Stack<CommandEditor> history = new Stack<CommandEditor>();
	
	public void push(CommandEditor c) {
		history.push(c);		
	}
	
	public CommandEditor pop() {
		return history.pop();
	}
	
	public boolean isEmpty() {
		return history.isEmpty();
	}

}
