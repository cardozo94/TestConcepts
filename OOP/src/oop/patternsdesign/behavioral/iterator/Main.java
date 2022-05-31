package oop.patternsdesign.behavioral.iterator;

import oop.patternsdesign.behavioral.iterator.collection.NotificationCollection;

public class Main {

	//This example is base on /OOP/resources/behavioral/NotificationIterator.png
	public static void main(String[] args) {
		NotificationCollection nc = new NotificationCollection();
		NotificationBar nb = new NotificationBar(nc);
		nb.printNotifications();
	}
}
