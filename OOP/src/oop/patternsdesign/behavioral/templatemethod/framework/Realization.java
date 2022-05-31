package oop.patternsdesign.behavioral.templatemethod.framework;

public class Realization extends Specialization {

	@Override
	protected void step3_2() {
		System.out.println("Realization.step3_2");
	}

	@Override
	void stepTwo() {
		System.out.println("Realization.stepTwo");
	}
	
	protected void stepFour() {
		System.out.println("Realization.stepFour");
		super.stepFour();
	}

}
