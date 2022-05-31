package oop.patternsdesign.behavioral.mediator.consumers;

import oop.patternsdesign.behavioral.mediator.Mediator;

public class Consumer implements Runnable {
	
	private Mediator med;
	private int id;
	private static int num =1;
	
	public Consumer(Mediator m) {
		med = m;
		id = num ++;
		}

	@Override
	public void run() {
		while (true) {
			System.out.println("c "+id+"-"+med.retriveMessage()+" ");			
		}
	}

}
