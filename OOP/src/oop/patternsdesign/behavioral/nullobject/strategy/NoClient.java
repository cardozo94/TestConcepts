package oop.patternsdesign.behavioral.nullobject.strategy;

public class NoClient extends Employee {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available";
	}

}
