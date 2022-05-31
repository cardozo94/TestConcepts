package oop.patternsdesign.behavioral.iterator;

import oop.patternsdesign.behavioral.iterator.collection.NameRepository;
import oop.patternsdesign.behavioral.iterator.iterator.Iterator;

public class IteratorPatternDemo {

	//This example is base on /OOP/resources/behavioral/iterator_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();
		
		for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println("Name : "+name);
			
		}
	}
}
