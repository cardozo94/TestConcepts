package oop.patternsdesign.behavioral.mediator.components;

import oop.patternsdesign.behavioral.mediator.IATCMediator;

public class Runway implements Command {

	private IATCMediator atcMediator;
	
	public Runway(IATCMediator atcMediator) {
		this.atcMediator = atcMediator;
		this.atcMediator.setLandingStatus(true);
	}
	
	@Override
	public void land() {
		 System.out.println("Landing permission granted.");
		atcMediator.setLandingStatus(true);
	}

}
