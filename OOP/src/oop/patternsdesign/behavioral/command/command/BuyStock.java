package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.Stock;

public class BuyStock implements Order {
	
	private Stock abcStock;
	
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.buy();
	}

}
