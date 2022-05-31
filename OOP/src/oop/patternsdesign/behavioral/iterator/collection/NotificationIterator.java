package oop.patternsdesign.behavioral.iterator.collection;

import oop.patternsdesign.behavioral.iterator.Notification;
import oop.patternsdesign.behavioral.iterator.iterator.IteratorII;

public class NotificationIterator implements IteratorII {
	
	Notification[] notificationList;
	int pos =0;
	
	public NotificationIterator(Notification[] notificationList) {
		this.notificationList = notificationList;
	}

	@Override
	public boolean hasNext() {
		if(pos >= notificationList.length||notificationList[pos]==null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		Notification notification = notificationList[pos];
		pos +=1;
		return notification;
	}

}
