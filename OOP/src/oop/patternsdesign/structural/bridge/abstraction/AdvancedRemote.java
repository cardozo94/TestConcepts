package oop.patternsdesign.structural.bridge.abstraction;

import oop.patternsdesign.structural.bridge.implementation.Device;

public class AdvancedRemote extends BasicRemote {

	public AdvancedRemote(Device device) {
		super.device = device;
	}

	public void mute() {
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}
