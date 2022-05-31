package oop.patternsdesign.behavioral.command.invoker;

import java.util.ArrayList;
import java.util.List;

import oop.patternsdesign.behavioral.command.command.Order;

public class Broker {
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void placeOrders() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}

}
