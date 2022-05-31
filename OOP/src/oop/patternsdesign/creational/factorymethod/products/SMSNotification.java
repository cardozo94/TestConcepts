package oop.patternsdesign.creational.factorymethod.products;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending an SMS notification");
	}

}
