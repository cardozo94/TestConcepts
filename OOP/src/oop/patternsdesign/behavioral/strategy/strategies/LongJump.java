package oop.patternsdesign.behavioral.strategy.strategies;

public class LongJump implements JumpBehavior {

	@Override
	public void jump() {
		System.out.println("Long Jump");
	}

}
