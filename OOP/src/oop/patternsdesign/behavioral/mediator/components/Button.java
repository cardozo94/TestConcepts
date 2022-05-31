package oop.patternsdesign.behavioral.mediator.components;

import oop.patternsdesign.behavioral.mediator.MediatorII;

public class Button {
	
	private MediatorII mediator;
	
	public void setMediator(MediatorII mediator) {
		this.mediator = mediator;
	}
	
	public void press() {
		mediator.press();
	}

}
