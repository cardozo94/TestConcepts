package org.camcar.springtutorial.xmlconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	
	public static void main(String[] args) {
		//--------------------------------------------------------------------------------------------//
		/*
		 * without using spring
		  Triangle triangle = new Triangle();
		 */
		//--------------------------------------------------------------------------------------------//
		/*using spring bean factory --- file spring.xml should be on root directory of the project
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		*/
		//--------------------------------------------------------------------------------------------//
		/*using spring application context --- file spring.xml should be in src folder 
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Triangle triangle = (Triangle) context.getBean("triangle");
		*/
		//--------------------------------------------------------------------------------------------//
		//Injecting Objects
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");*/
	
		//--------------------------------------------------------------------------------------------//
		//Initializing collections and bean autowire
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		//--------------------------------------------------------------------------------------------//
		//Scope definition
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		Triangle triangle2 = (Triangle) context.getBean("triangle");
		System.out.println("triangle 2");
		triangle2.draw();
		Point point = new Point();
		point.setX(50);
		point.setY(-50);
		triangle.setPointA(point);
		System.out.println("triangle 1");
		triangle.draw();
		System.out.println("triangle 2");
		triangle2.draw();*/
		//--------------------------------------------------------------------------------------------//
		//ApplicationContextAware and bean inheritance
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		//--------------------------------------------------------------------------------------------//
		//Bean inheritance
		/*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();*/
		//--------------------------------------------------------------------------------------------//
		//Lifecycle callback
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();//to close context
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		
		//--------------------------------------------------------------------------------------------//
		//BeanPostProcessor, bean factory post processor
		/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();*/
		
		//--------------------------------------------------------------------------------------------//
		//Coding to interface
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Shape shape = (Shape) context.getBean("triangle");
		shape.draw();
	}

}
