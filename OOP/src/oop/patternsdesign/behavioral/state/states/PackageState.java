package oop.patternsdesign.behavioral.state.states;

import oop.patternsdesign.behavioral.state.contexts.Package;

public interface PackageState {
	
	void next(Package pkg);
	void prev(Package pkg);
	void printStatus();

}
