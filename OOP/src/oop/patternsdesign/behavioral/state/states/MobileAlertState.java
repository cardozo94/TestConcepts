package oop.patternsdesign.behavioral.state.states;

import oop.patternsdesign.behavioral.state.contexts.AlertStateContext;

public interface MobileAlertState {
	public void alert(AlertStateContext ctx);
}
