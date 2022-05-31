package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.Command;
import oop.patternsdesign.behavioral.command.receiver.Light;

public class LigthOnCommand implements Command {
	
	Light light;
	
	public LigthOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
