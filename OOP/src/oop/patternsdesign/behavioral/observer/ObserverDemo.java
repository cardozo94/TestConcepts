package oop.patternsdesign.behavioral.observer;

import java.util.Scanner;

import oop.patternsdesign.behavioral.observer.observers.BinObserver;
import oop.patternsdesign.behavioral.observer.observers.HexObserver;
import oop.patternsdesign.behavioral.observer.observers.OctObserver;
import oop.patternsdesign.behavioral.observer.subjects.Subject;

public class ObserverDemo {

	public static void main(String[] args) {
		Subject sub = new Subject();
		
		new HexObserver(sub);
		new OctObserver(sub);
		new BinObserver(sub);
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("\nEnter a number: ");
			sub.setState(scan.nextInt());
		}

	}

}
