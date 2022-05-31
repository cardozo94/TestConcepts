package oop.patternsdesign.behavioral.strategy;

import oop.patternsdesign.behavioral.strategy.contexts.Figther;
import oop.patternsdesign.behavioral.strategy.contexts.Ken;
import oop.patternsdesign.behavioral.strategy.strategies.JumpBehavior;
import oop.patternsdesign.behavioral.strategy.strategies.KickBehavior;
import oop.patternsdesign.behavioral.strategy.strategies.LongJump;
import oop.patternsdesign.behavioral.strategy.strategies.ShortJump;
import oop.patternsdesign.behavioral.strategy.strategies.TornadoKick;

public class StreetFighter {

	//This example is base on /OOP/resources/behavioral/boxi3.jpg
	public static void main(String[] args) {
		JumpBehavior shortJump = new ShortJump();
		JumpBehavior longJump = new LongJump();
		KickBehavior tornadoKick = new TornadoKick();
		
		Figther ken = new Ken(tornadoKick, shortJump);
		ken.display();
		
		ken.punch();
		ken.jump();
		ken.kick();
		
		ken.setJumpBehavior(longJump);
		ken.jump();
	}

}
