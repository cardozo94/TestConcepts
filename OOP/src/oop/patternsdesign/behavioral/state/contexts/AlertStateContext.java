package oop.patternsdesign.behavioral.state.contexts;

import oop.patternsdesign.behavioral.state.states.MobileAlertState;
import oop.patternsdesign.behavioral.state.states.Vibration;

public class AlertStateContext {

	private MobileAlertState currentstate;
	
	public AlertStateContext() {
		currentstate = new Vibration();
	}
	
	public void setState(MobileAlertState state) {
		currentstate = state;
	}
	
	public void alert() {
		currentstate.alert(this);
	}
}
