package oop.patternsdesign.creational.singleton;

public class SingletonPatternDemo {

	//This example is base on /OOP/resources/creational/singleton_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
