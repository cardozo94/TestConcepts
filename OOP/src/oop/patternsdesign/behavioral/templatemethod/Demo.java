package oop.patternsdesign.behavioral.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oop.patternsdesign.behavioral.templatemethod.framework.Facebook;
import oop.patternsdesign.behavioral.templatemethod.framework.Network;
import oop.patternsdesign.behavioral.templatemethod.framework.Twitter;

public class Demo {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Network network = null;
		System.out.println("Input user name: ");
		String userName = reader.readLine();
		System.out.println("Input password: ");
		String password = reader.readLine();
		
		System.out.println("Input message: ");
		String message = reader.readLine();
		
		System.out.println("\nChoose social network for posting message.\n1-Facebook\n2-Twitter");
		int choice = Integer.parseInt(reader.readLine());
		if (choice == 1) 
			network = new Facebook(userName, password);
		else if(choice == 2)
			network = new Twitter(userName, password);
		network.post(message);

	}

}
