package oop.patternsdesign.creational.abstractfactory;

import oop.patternsdesign.creational.abstractfactory.banks.Bank;
import oop.patternsdesign.creational.abstractfactory.loans.*;

public class LoanFactory extends AbstractFactoory {

	@Override
	public Bank getBank(String bank) {
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		Loan loanEnt;
		if(loan == null){  
			loanEnt = null;  
	      }  
	      if(loan.equalsIgnoreCase("Home")){  
	    	  loanEnt = new HomeLoan();  
	      } else if(loan.equalsIgnoreCase("Business")){  
	    	  loanEnt = new BussinessLoan();  
	      } else if(loan.equalsIgnoreCase("Education")){  
	    	  loanEnt = new EducationLoan();  
	      } else {
	    	  loanEnt = null;
	      }
	      return loanEnt;  
	}

}
