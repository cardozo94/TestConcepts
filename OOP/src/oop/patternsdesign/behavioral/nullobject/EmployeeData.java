package oop.patternsdesign.behavioral.nullobject;

import oop.patternsdesign.behavioral.nullobject.strategy.Coder;
import oop.patternsdesign.behavioral.nullobject.strategy.Employee;
import oop.patternsdesign.behavioral.nullobject.strategy.NoClient;

public class EmployeeData {
	
	public static final String[] names = {"Lokesh", "Kushagra", "Vikram"};
    
	public static Employee getClient(String name) {
		for (int i = 0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(name))
				return new Coder(name);
		}
		return new NoClient();
	}

}
