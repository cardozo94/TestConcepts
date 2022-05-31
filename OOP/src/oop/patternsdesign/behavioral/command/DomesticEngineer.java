package oop.patternsdesign.behavioral.command;

public class DomesticEngineer implements Command {

	@Override
	public void execute() {
		System.out.println("take out the trash");
	}

}
