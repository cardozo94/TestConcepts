package oop.patternsdesign.behavioral.command;

import oop.patternsdesign.behavioral.command.command.LigthOnCommand;
import oop.patternsdesign.behavioral.command.invoker.SimpleRemoteControl;
import oop.patternsdesign.behavioral.command.receiver.Light;
import oop.patternsdesign.behavioral.command.receiver.Stereo;
import oop.patternsdesign.behavioral.command.receiver.StereoOffCommand;
import oop.patternsdesign.behavioral.command.receiver.StereoOnWithCDCommand;

public class RemoteControlTest {

	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Stereo stereo = new Stereo();
		
		remote.setCommand(new LigthOnCommand(light));
		remote.buttonWasPressed();
		remote.setCommand(new StereoOnWithCDCommand(stereo));
		remote.buttonWasPressed();
		remote.setCommand(new StereoOffCommand(stereo));
		remote.buttonWasPressed();
	}

}
