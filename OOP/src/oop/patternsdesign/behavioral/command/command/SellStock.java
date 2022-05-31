package oop.patternsdesign.behavioral.command.command;

import oop.patternsdesign.behavioral.command.receiver.Stock;

public class SellStock implements Order {

	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	
	@Override
	public void execute() {
		abcStock.sell();
	}

}
