package oop.patternsdesign.behavioral.nullobject;

import oop.patternsdesign.behavioral.nullobject.strategy.Employee;

public class Main {

	//This example is base on /OOP/resources/behavioral/NullObject.png
	public static void main(String[] args) {
		Employee emp1 = EmployeeData.getClient("Lokesh");
		Employee emp2 = EmployeeData.getClient("Kushagra");
		Employee emp3 = EmployeeData.getClient("Vikram");
		Employee emp4 = EmployeeData.getClient("Rishabh");
  
  
        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
	}

}
