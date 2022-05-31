package oop.patternsdesign.creational.abstractfactory;

import oop.patternsdesign.creational.abstractfactory.banks.*;
import oop.patternsdesign.creational.abstractfactory.loans.Loan;

public class BankFactory extends AbstractFactoory {

	@Override
	public Bank getBank(String bank) {
		Bank bankEnt;
		if (bank == null) {
			bankEnt = null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			bankEnt = new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			bankEnt = new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			bankEnt = new SBI();
		}else {
			bankEnt= null;
		}
		return bankEnt;
	}

	@Override
	public Loan getLoan(String Loan) {
		return null;
	}

}
