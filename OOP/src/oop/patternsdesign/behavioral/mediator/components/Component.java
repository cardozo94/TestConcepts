package oop.patternsdesign.behavioral.mediator.components;

import oop.patternsdesign.behavioral.mediator.MediatorIII;

public interface Component {
	
	void setMediator(MediatorIII mediator);
	String getName();

}
