package oop.patternsdesign.behavioral.command;

import oop.patternsdesign.behavioral.command.command.BuyStock;
import oop.patternsdesign.behavioral.command.command.SellStock;
import oop.patternsdesign.behavioral.command.invoker.Broker;
import oop.patternsdesign.behavioral.command.receiver.Stock;

public class CommandPatternDemo {

	//This example is base on /OOP/resources/behavioral/command_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		
		broker.placeOrders();
	}

}
