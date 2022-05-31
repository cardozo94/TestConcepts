package oop.patternsdesign.behavioral.chainofresponsability.client;	

import oop.patternsdesign.behavioral.chainofresponsability.Number;
import oop.patternsdesign.behavioral.chainofresponsability.handlers.Chain;

public class TestChain {

	public static void main(String[] args) {
		Chain chain = new Chain();
		
		chain.process(new Number(90));
		chain.process(new Number(-50));
		chain.process(new Number(0));
		chain.process(new Number(91));

	}

}
