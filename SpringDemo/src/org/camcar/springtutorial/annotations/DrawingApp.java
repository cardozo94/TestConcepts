package org.camcar.springtutorial.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		//--------------------------------------------------------------------------------------------//
		//Annotations
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
//		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();*/
		//--------------------------------------------------------------------------------------------//
		//properties file
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		//System.out.println(context.getMessage("greeting", null, "Default Greeting.", null));*/
		//--------------------------------------------------------------------------------------------//
		//event handling
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}

}
