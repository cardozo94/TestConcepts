package oop.patternsdesign.behavioral.state.states;

import oop.patternsdesign.behavioral.state.contexts.Context;

public class StopState implements StateI {

	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	public String toString() {
		return "Stop State";
	}

}
