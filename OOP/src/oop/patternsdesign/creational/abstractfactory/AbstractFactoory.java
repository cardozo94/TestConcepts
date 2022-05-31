package oop.patternsdesign.creational.abstractfactory;

import oop.patternsdesign.creational.abstractfactory.banks.Bank;
import oop.patternsdesign.creational.abstractfactory.loans.Loan;

public abstract class AbstractFactoory {
	
	public abstract Bank getBank(String bank);
	
	public abstract Loan getLoan(String loan);

}
