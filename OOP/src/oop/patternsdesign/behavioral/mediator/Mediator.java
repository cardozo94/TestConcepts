package oop.patternsdesign.behavioral.mediator;

public class Mediator {

	private boolean slotFull = false;
	private int number;
	
	public synchronized void storeMessage(int num) {
		while(slotFull) {
			try {
				wait();
			}catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		slotFull = true;
		number = num;
		notifyAll();
	}
	
	public synchronized int retriveMessage() {
		while (!slotFull) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
		slotFull = false;
		notifyAll();
		return number;
	}
}
