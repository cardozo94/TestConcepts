package oop.patternsdesign.behavioral.state.states;

import oop.patternsdesign.behavioral.state.contexts.AlertStateContext;

public class Vibration implements MobileAlertState {

	@Override
	public void alert(AlertStateContext ctx) {
		System.out.println("Vibration...");
	}

}
