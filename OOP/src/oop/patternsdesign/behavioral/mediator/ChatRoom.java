package oop.patternsdesign.behavioral.mediator;

import java.util.Date;

import oop.patternsdesign.behavioral.mediator.components.User;

public class ChatRoom {
	
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString()+" ["+user.getName()+"] : "+message);
	}

}
