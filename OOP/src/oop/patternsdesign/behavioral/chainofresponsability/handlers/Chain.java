package oop.patternsdesign.behavioral.chainofresponsability.handlers;

import oop.patternsdesign.behavioral.chainofresponsability.Number;

public class Chain {

	Processor chain;
	
	public Chain() {
		buildChain();
	}
	
	private void buildChain() {
		chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
	}
	
	public void process(Number request) {
		chain.process(request);
	}
}
