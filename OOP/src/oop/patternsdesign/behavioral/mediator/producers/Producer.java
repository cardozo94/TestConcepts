package oop.patternsdesign.behavioral.mediator.producers;

import oop.patternsdesign.behavioral.mediator.Mediator;

public class Producer implements Runnable {
	
	private Mediator med;
	private int id;
	private static int num = 1;
	
	public Producer(Mediator m) {
		med = m;
		id = num++;
	}

	@Override
	public void run() {
		int num;
		while (true) {
			med.storeMessage(num = (int)(Math.random()*100));
			System.out.println("p "+id+"-"+num+" ");
		}

	}

}
