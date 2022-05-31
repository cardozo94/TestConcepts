package oop.patternsdesign.creational.abstractfactory;

import javax.swing.JOptionPane;

import oop.patternsdesign.creational.abstractfactory.animals.*;
import oop.patternsdesign.creational.abstractfactory.colors.*;

public class UseFactory {
	
	
	//This example is base on /OOP/resources/creational/updated_abstract_factory.jpg
	public static void main(String[] args) {
		String type = JOptionPane.showInputDialog("Enter the type");
		AbstractFactory<?> factory = FactoryProvider.getFactory(type);
		String product = JOptionPane.showInputDialog("Enter the product");
		Object obj = factory.create(product);
		Animal pet;
		Color color;
		if(obj instanceof Animal) {
			pet = (Animal) obj;
			System.out.println("Su animal es "+pet.getAnimal()+ " y hace "+pet.makeSound());
		}else if(obj instanceof Color) {
			color = (Color) obj;
			System.out.println("Su color es "+color.getColor());
		}
		System.out.println("");
		
	}

}
