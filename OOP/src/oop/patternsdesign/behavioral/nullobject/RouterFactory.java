package oop.patternsdesign.behavioral.nullobject;

import oop.patternsdesign.behavioral.nullobject.strategy.JmsRouter;
import oop.patternsdesign.behavioral.nullobject.strategy.Message;
import oop.patternsdesign.behavioral.nullobject.strategy.NullRouter;
import oop.patternsdesign.behavioral.nullobject.strategy.Router;
import oop.patternsdesign.behavioral.nullobject.strategy.SmsRouter;

public class RouterFactory {

	public static Router getRouterForMessage(Message msg) {
		if(msg.getPriority() == null) {
			return new NullRouter();
		}
		switch (msg.getPriority()) {
		case "high":
			return new SmsRouter();
		case "medium":
			return new JmsRouter();
		default:
			return new NullRouter();
		}
	}
	
}
