package oop.patternsdesign.behavioral.chainofresponsability.handlers;

import oop.patternsdesign.behavioral.chainofresponsability.Number;

public class ZeroProcessor extends Processor {

	public ZeroProcessor(Processor processor) {
		super(processor);
	}

	public void process(Number request) {
		System.out.println("Checking zero ...");
		if(request.getNumber() == 0)
			System.out.println("ZeroProcessor: "+request.getNumber());
		else
			super.process(request);
	}
}
