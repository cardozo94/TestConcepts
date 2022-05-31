package oop.patternsdesign.structural.composite;

import oop.patternsdesign.structural.composite.component.Developer;
import oop.patternsdesign.structural.composite.component.Manager;
import oop.patternsdesign.structural.composite.component.CompanyDirectory;

public class Company {

	//This example is base on /OOP/resources/structural/Composite-Design-Pattern-Diagram-1.png
	public static void main(String[] args) {
		Developer dev1 = new Developer(100, "Lokesh sharma", "Pro Developer");
		Developer dev2 = new Developer(101, "Vinay sharma", "Developer");
		
		CompanyDirectory engDirectory = new CompanyDirectory();
		engDirectory.addEmployee(dev1);
		engDirectory.addEmployee(dev2);
		
		Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
		Manager man2 = new Manager(201, "Vikram sharma", "Kushagra's Manager");
		
		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(man1);
		accDirectory.addEmployee(man2);
		
		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(engDirectory);
		directory.addEmployee(accDirectory);
		directory.showEmployeeDetails();

	}

}
