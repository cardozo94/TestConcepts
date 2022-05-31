package oop.patternsdesign.structural.composite;

import oop.patternsdesign.structural.composite.component.Employeee;

public class CompositePatterDemo {

	//This example is base on /OOP/resources/structural/composite_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		
		Employeee CEO = new Employeee("Jhon", "CEO", 30000);
		
		Employeee headSales = new Employeee("Robert", "Head Sales", 20000);
		Employeee headMarketing = new Employeee("Michel", "Head Marketing", 20000);
		
		Employeee clerk1 = new Employeee("Laura", "Marketing", 10000);
		Employeee clerk2 = new Employeee("Bob", "Marketing", 10000);
		
		Employeee salesExecutive1 = new Employeee("Richard", "Sales", 10000);
		Employeee salesExecutive2 = new Employeee("Rob", "Sales", 10000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		System.out.println(CEO);
		for (Employeee headEmployee : CEO.getSubordinates()) {
			System.out.println(" -- "+headEmployee);
			for (Employeee employee : headEmployee.getSubordinates()) {
				System.out.println("    --"+employee);
			}
		}

	}

}
