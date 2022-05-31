package oop.patternsdesign.behavioral.chainofresponsability.handlers;

import oop.patternsdesign.behavioral.chainofresponsability.Number;

public class NegativeProcessor extends Processor {

	public NegativeProcessor(Processor processor) {
		super(processor);
	}

	public void process(Number request) {
		System.out.println("Checking negative ...");
		if(request.getNumber() < 0)
			System.out.println("NegativeProcessor: "+request.getNumber());
		else
			super.process(request);
	}
	
}
