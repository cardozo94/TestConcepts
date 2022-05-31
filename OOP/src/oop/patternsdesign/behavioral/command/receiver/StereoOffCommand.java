package oop.patternsdesign.behavioral.command.receiver;

import oop.patternsdesign.behavioral.command.Command;

public class StereoOffCommand implements Command {
	
	Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		stereo.off();
	}

}
