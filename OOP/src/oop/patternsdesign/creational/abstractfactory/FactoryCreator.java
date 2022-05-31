package oop.patternsdesign.creational.abstractfactory;

public class FactoryCreator {
	
	public static AbstractFactoory getFactory(String choice) {
		AbstractFactoory factory;
		if(choice.equalsIgnoreCase("Bank"))
			factory = new BankFactory();
		else if (choice.equalsIgnoreCase("Loan"))
			factory = new LoanFactory();
		else
			factory = null;
		return factory;
	}

}
