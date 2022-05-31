package oop.patternsdesign.behavioral.strategy.strategies;

public class FOO extends StrategySolution {
	
	private int state = 1;

	@Override
	void start() {
		System.out.println("Start ");
	}

	@Override
	boolean nextTry() {
		System.out.println("NextTry- "+state+++"	");
		return true;
	}

	@Override
	boolean isSolution() {
		System.out.println("IsSolution- "+(state==3)+"	");
		return (state ==3);
	}

	@Override
	void stop() {
		System.out.println("Stop ");
	}

}
