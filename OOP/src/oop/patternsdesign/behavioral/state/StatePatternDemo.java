package oop.patternsdesign.behavioral.state;

import oop.patternsdesign.behavioral.state.contexts.Context;
import oop.patternsdesign.behavioral.state.states.StartState;
import oop.patternsdesign.behavioral.state.states.StopState;

public class StatePatternDemo {
	
	//This example is base on /OOP/resources/behavioral/state_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState start = new StartState();
		start.doAction(context);
		System.out.println(context.getState().toString());
		
		StopState stop = new StopState();
		stop.doAction(context);
		System.out.println(context.getState().toString());

	}

}
