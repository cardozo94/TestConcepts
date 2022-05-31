package oop.patternsdesign.behavioral.strategy;

import oop.patternsdesign.behavioral.strategy.strategies.BAR;
import oop.patternsdesign.behavioral.strategy.strategies.FOO;
import oop.patternsdesign.behavioral.strategy.strategies.Strategy;

public class StrategyDemo {

	private static void execute(Strategy strategy) {
		strategy.solve();
	}
	
	public static void main(String[] args) {
		Strategy[] algorithms = {new FOO(), new BAR()};
		for (Strategy algorithm : algorithms) {
			execute(algorithm);
		}
	}

}
