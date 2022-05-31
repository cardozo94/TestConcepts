package oop.patternsdesign.behavioral.strategy;

import oop.patternsdesign.behavioral.strategy.contexts.Context;
import oop.patternsdesign.behavioral.strategy.strategies.OperationAdd;
import oop.patternsdesign.behavioral.strategy.strategies.OperationMultiply;
import oop.patternsdesign.behavioral.strategy.strategies.OperationSubstract;

public class StrategyPatternDemo {

	//This example is base on /OOP/resources/behavioral/strategy_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Context context= new Context(new OperationAdd());
		System.out.println("10 + 5 ="+context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 ="+context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 ="+context.executeStrategy(10, 5));
	}

}
