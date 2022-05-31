package oop.patternsdesign.creational.factorymethod.factory;

import oop.patternsdesign.creational.factorymethod.products.EmailNotification;
import oop.patternsdesign.creational.factorymethod.products.Notification;
import oop.patternsdesign.creational.factorymethod.products.PushNotification;
import oop.patternsdesign.creational.factorymethod.products.SMSNotification;

public class NotificationFactory {

	
	public Notification createNotification(String channel) {
		Notification notification;
		if(channel == null || channel.isEmpty())
			notification = null;
		if("SMS".equals(channel))
			notification = new SMSNotification();
		else if("EMAIL".equals(channel))
			notification = new EmailNotification();
		else if("PUSH".equals(channel))
			notification = new PushNotification();
		else
			notification = null;
		return notification;
	}
}
