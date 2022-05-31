package oop.patternsdesign.behavioral.strategy.contexts;

import oop.patternsdesign.behavioral.strategy.strategies.JumpBehavior;
import oop.patternsdesign.behavioral.strategy.strategies.KickBehavior;

public class Ryu extends Figther {

	public Ryu(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		super(kickBehavior, jumpBehavior);
	}

	@Override
	public void display() {
		System.out.println("Ryu");
	}

}
