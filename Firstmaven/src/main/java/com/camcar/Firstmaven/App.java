package com.camcar.Firstmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//dependency injection this can done with spring
//    	Vehicle vehicle = new Car();
//    	vehicle.drive();
    	//here is how spring do it
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Vehicle vehicle = (Vehicle)context.getBean("car");
    	vehicle.drive();
    	
//    	Tire tire = (Tire) context.getBean("tire");
//    	System.out.println(tire);
    	
    }
}
