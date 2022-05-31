package oop.patternsdesign.behavioral.state;

import oop.patternsdesign.behavioral.state.contexts.AlertStateContext;
import oop.patternsdesign.behavioral.state.states.Silent;

public class StatePattern {

	//This example is base on /OOP/resources/behavioral/State-Design-Pattern-Diagram.png
	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();
	}

}
