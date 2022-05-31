package oop.patternsdesign.structural.proxy.client;

import oop.patternsdesign.structural.proxy.service.ExpensiveObject;
import oop.patternsdesign.structural.proxy.service.ExpensiveObjectProxy;

public class Client {

	//This example is base on /OOP/resources/structural/MrvrsH6.jpg
	public static void main(String[] args) {
		ExpensiveObject object = new ExpensiveObjectProxy();
		object.process();
		object.process();
	}

}
