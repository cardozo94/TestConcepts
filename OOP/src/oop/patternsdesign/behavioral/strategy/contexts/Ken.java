package oop.patternsdesign.behavioral.strategy.contexts;

import oop.patternsdesign.behavioral.strategy.strategies.JumpBehavior;
import oop.patternsdesign.behavioral.strategy.strategies.KickBehavior;

public class Ken extends Figther {

	public Ken(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}

	@Override
	public void display() {
		System.out.println("Ken");
	}

}
