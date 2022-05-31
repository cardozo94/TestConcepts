package oop.patternsdesign.behavioral.command.receiver;

import oop.patternsdesign.behavioral.command.Command;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo= stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.sertCD();
		stereo.setVolume(11);
	}

}
