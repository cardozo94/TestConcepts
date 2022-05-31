package oop.patternsdesign.structural.bridge;

import oop.patternsdesign.structural.bridge.abstraction.AdvancedRemote;
import oop.patternsdesign.structural.bridge.abstraction.BasicRemote;
import oop.patternsdesign.structural.bridge.implementation.Device;
import oop.patternsdesign.structural.bridge.implementation.Radio;
import oop.patternsdesign.structural.bridge.implementation.Tv;

public class Demo {
	
	public static void main(String[] args) {
		testDevice(new Tv());
		testDevice(new Radio());
	}
	
	public static void testDevice(Device device) {
		System.out.println("Test with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		device.printStatus();
		
		System.out.println("Test with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}

}
