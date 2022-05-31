package oop.patternsdesign.structural.proxy.client;

import oop.patternsdesign.structural.proxy.service.Image;
import oop.patternsdesign.structural.proxy.service.ProxyImage;

public class ProxyPatternDemo {

	//This example is base on /OOP/resources/structural/proxy_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jgp");
		
		image.display();
		System.out.println("");
		image.display();

	}

}
