package oop.patternsdesign.creational.abstractfactory;

import oop.patternsdesign.creational.abstractfactory.animals.*;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		Animal pet;
		if("Dog".equalsIgnoreCase(animalType))
			pet = new Dog();
		else if ("Duck".equalsIgnoreCase(animalType))
			pet = new Duck();
		else if ("Bear".equalsIgnoreCase(animalType))
			pet = new Bear();
		else 
			pet = null;
		return pet;
	}

}
