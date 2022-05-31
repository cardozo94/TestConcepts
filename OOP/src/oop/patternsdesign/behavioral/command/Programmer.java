package oop.patternsdesign.behavioral.command;

public class Programmer implements Command {

	@Override
	public void execute() {
		System.out.println("sel the bugs, charge extra for the fixes");
	}

}
