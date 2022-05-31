package oop.patternsdesign.creational.factorymethod.products;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending an e-mail notification");
	}


}
