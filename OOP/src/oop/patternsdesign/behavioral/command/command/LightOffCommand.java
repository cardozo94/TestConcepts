package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.Command;
import oop.patternsdesign.behavioral.command.receiver.Light;

public class LightOffCommand implements Command {
	
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
