package oop.patternsdesign.behavioral.strategy.contexts;

import oop.patternsdesign.behavioral.strategy.strategies.JumpBehavior;
import oop.patternsdesign.behavioral.strategy.strategies.KickBehavior;

public abstract class Figther {

	KickBehavior kickBehavior;
	JumpBehavior jumpBehavior;
	
	public Figther(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		this.jumpBehavior = jumpBehavior;
		this.kickBehavior = kickBehavior;
	}
	
	public void punch() {
		System.out.println("Default Punch");
	}
	
	public void kick() {
		kickBehavior.kick();
	}
	
	public void jump() {
		jumpBehavior.jump();
	}
	
	public void roll() {
		System.out.println("Default Roll");
	}
	
	public void setKickBehavior(KickBehavior kickBehavior) {
		this.kickBehavior = kickBehavior;
	}
	
	public void setJumpBehavior(JumpBehavior jumpBehavior) {
		this.jumpBehavior = jumpBehavior;
	}
	
	public abstract void display();
}
