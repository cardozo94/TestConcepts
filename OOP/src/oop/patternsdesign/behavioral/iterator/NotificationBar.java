package oop.patternsdesign.behavioral.iterator;

import oop.patternsdesign.behavioral.iterator.collection.NotificationCollection;
import oop.patternsdesign.behavioral.iterator.iterator.IteratorII;

public class NotificationBar {
	
	NotificationCollection notifications;
	
	public NotificationBar(NotificationCollection notifications) {
		this.notifications = notifications;
	}

	public void printNotifications() {
		
		IteratorII iterator = notifications.createIterator();
		System.out.println("---------NOTIFICATION BAR-------------");
		while(iterator.hasNext()) {
			Notification n = (Notification)iterator.next();
			System.out.println(n.getNotification());
		}
	}
}
