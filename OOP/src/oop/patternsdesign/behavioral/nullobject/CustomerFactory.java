package oop.patternsdesign.behavioral.nullobject;

import oop.patternsdesign.behavioral.nullobject.strategy.AbstractCustomer;
import oop.patternsdesign.behavioral.nullobject.strategy.NullCustomer;
import oop.patternsdesign.behavioral.nullobject.strategy.RealCustomer;

public class CustomerFactory {

	public static final String[] names = {"Rob", "Joe", "Julie"};
	
	public static AbstractCustomer getCustomer(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(name))
				return new RealCustomer(name);			
		}
		return new NullCustomer();
	}
	
}
