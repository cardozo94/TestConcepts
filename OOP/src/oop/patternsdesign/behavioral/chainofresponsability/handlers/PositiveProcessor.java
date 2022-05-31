package oop.patternsdesign.behavioral.chainofresponsability.handlers;

import oop.patternsdesign.behavioral.chainofresponsability.Number;

public class PositiveProcessor extends Processor {

	public PositiveProcessor(Processor processor) {
		super(processor);
	}

	public void process(Number request) {
		System.out.println("Checking positive ...");
		if(request.getNumber() > 0)
			System.out.println("PositiveProcessor: "+request.getNumber());
		else
			super.process(request);
	}
}
