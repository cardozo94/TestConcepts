package oop.patternsdesign.behavioral.strategy.strategies;

public class CreditCard {
	
	private int amount;
	private String number;
	private String date;
	private String cvv;
	
	public CreditCard(String number, String date, String cvv) {
		this.amount = 10_000;
		this.number = number;
		this.date = date;
		this.cvv = cvv;
	}

	public void setAmmount(int ammount) {
		this.amount = ammount;
	}
	
	public int getAmmount() {
		return amount;
	}
}
