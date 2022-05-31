package oop.patternsdesign.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

	public static List<Command> produceRequests() {
		List<Command> queue = new ArrayList<Command>();
		queue.add(new DomesticEngineer());
		queue.add(new Politician());
		queue.add(new Programmer());
		return queue;
	}
	
	public static void workOffRequests(List<Command> queue) {
		for (Command command : queue) {
			command.execute();			
		}
	}

	public static void main(String[] args) {
		List<Command> queue = produceRequests();
		workOffRequests(queue);

	}

}
