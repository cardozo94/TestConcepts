package oop.patternsdesign.behavioral.mediator;

import oop.patternsdesign.behavioral.mediator.components.Flight;
import oop.patternsdesign.behavioral.mediator.components.Runway;

public interface IATCMediator {
	
	public void registerRunway(Runway runway);
	public void registerFlight(Flight flight);
	public boolean isLandingOk();
	public void setLandingStatus(boolean status);

}
