package oop.patternsdesign.creational.singleton;

public class SingleObject {
	
	//early instantiation
	private static SingleObject instance = new SingleObject();
	
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}

}
