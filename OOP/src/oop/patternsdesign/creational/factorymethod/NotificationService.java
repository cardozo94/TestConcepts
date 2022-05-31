package oop.patternsdesign.creational.factorymethod;

import oop.patternsdesign.creational.factorymethod.factory.NotificationFactory;
import oop.patternsdesign.creational.factorymethod.products.Notification;

public class NotificationService {

	//This example is base on /OOP/resources/creational/Class-Diagram-12.png
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("PUSH");
		notification.notifyUser();
	}

}
