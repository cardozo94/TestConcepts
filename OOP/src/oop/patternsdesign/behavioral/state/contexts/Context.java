package oop.patternsdesign.behavioral.state.contexts;

import oop.patternsdesign.behavioral.state.states.StateI;

public class Context {
	
	private StateI state;
	
	public Context() {
		state = null;
	}

	public StateI getState() {
		return state;
	}

	public void setState(StateI state) {
		this.state = state;
	}

}
