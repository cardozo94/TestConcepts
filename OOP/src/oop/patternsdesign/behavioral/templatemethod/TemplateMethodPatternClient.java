package oop.patternsdesign.behavioral.templatemethod;

import oop.patternsdesign.behavioral.templatemethod.framework.NetOrder;
import oop.patternsdesign.behavioral.templatemethod.framework.OrderProcessTemplate;
import oop.patternsdesign.behavioral.templatemethod.framework.StoreOrder;

public class TemplateMethodPatternClient {

	//This example is base on /OOP/resources/behavioral/claasDia.jpg
	public static void main(String[] args) {
		OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder(true);
		System.out.println();
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder(true);
	}
}
