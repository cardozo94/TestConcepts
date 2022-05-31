package oop.patternsdesign.creational.abstractfactory.animals;

public class Bear implements Animal {

	@Override
	public String getAnimal() {
		return "Bear";
	}

	@Override
	public String makeSound() {
		return "R-o-a-r";
	}

}
