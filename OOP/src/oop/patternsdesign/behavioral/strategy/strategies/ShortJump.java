package oop.patternsdesign.behavioral.strategy.strategies;

public class ShortJump implements JumpBehavior {

	@Override
	public void jump() {
		System.out.println("Short Jump");
	}

}
