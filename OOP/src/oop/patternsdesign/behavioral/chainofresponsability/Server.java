package oop.patternsdesign.behavioral.chainofresponsability;

import java.util.HashMap;
import java.util.Map;

import oop.patternsdesign.behavioral.chainofresponsability.handlers.Middleware;

public class Server {
	
	private Map<String, String> users = new HashMap<String, String>();
	private Middleware	middleware;
	
	public void setMiddleware(Middleware middleware) {
		this.middleware = middleware;
	}
	
	public boolean logIn(String email, String password) {
		if(middleware.check(email, password)) {
			System.out.println("Authorization have been succesful!");
			//Do something useful here
			return true;
		}
		return false;
	}
	
	public void register(String email, String password) {
		users.put(email, password);
	}
	
	public boolean hasEmail(String email) {
		return users.containsKey(email);
	}
	
	public boolean isValidPassword(String email, String password) {
		return users.get(email).equals(password);
	}

}
