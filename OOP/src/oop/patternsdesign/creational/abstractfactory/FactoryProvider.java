package oop.patternsdesign.creational.abstractfactory;

public class FactoryProvider {
	
	public static AbstractFactory<?> getFactory(String choice) {
		AbstractFactory<?> factory;
		if("Animal".equalsIgnoreCase(choice))
			factory = new AnimalFactory();
		else if ("color".equalsIgnoreCase(choice))
			factory = new ColorFactory();
		else
			factory = null;
		return factory;
	}

}
