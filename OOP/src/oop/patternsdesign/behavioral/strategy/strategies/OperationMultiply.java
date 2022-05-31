package oop.patternsdesign.behavioral.strategy.strategies;

public class OperationMultiply implements StrategyI {

	@Override
	public int doOperation(int num1, int num2) {
		return num1*num2;
	}

}
