package oop.patternsdesign.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oop.patternsdesign.behavioral.mediator.consumers.Consumer;
import oop.patternsdesign.behavioral.mediator.producers.Producer;

public class MediatorDemo {

	public static void main(String[] args) {
		List<Thread> producerList = new ArrayList<Thread>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press ENTER for exist");
		Mediator mb = new Mediator();
		producerList.add(new Thread(new Producer(mb)));
		producerList.add(new Thread(new Producer(mb)));
		producerList.add(new Thread(new Consumer(mb)));
		producerList.add(new Thread(new Consumer(mb)));
		producerList.add(new Thread(new Consumer(mb)));
		producerList.add(new Thread(new Consumer(mb)));
		for (Thread p : producerList) {
			p.start();
		}
		boolean stop = false;
		String exit = scanner.nextLine();
		while (!stop) {
			if(exit.equals("")) {
				stop = true;
				for (Thread p : producerList) {
					p.stop();
				}
			}
		}
	}

}
