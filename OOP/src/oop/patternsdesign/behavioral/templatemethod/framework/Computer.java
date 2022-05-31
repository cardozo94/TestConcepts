package oop.patternsdesign.behavioral.templatemethod.framework;

import java.util.HashMap;
import java.util.Map;

public class Computer {

	private Map<String, String> computerParts = new HashMap<String, String>();
	
	public Computer(Map<String, String> computerParts) {
		this.computerParts = computerParts;
	}

	public Map<String, String> getComputerParts() {
		return computerParts;
	}
}
