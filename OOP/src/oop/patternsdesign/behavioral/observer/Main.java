package oop.patternsdesign.behavioral.observer;

import oop.patternsdesign.behavioral.observer.observers.AverageScoreDisplay;
import oop.patternsdesign.behavioral.observer.observers.CurrentScoreDisplay;
import oop.patternsdesign.behavioral.observer.subjects.CricketData;

public class Main {

	//This example is base on /OOP/resources/behavioral/ObserverPatternSet-2.png
	public static void main(String[] args) {
		AverageScoreDisplay average = new AverageScoreDisplay();
		CurrentScoreDisplay current = new CurrentScoreDisplay();
		CricketData criketData = new CricketData();
		
		criketData.registerObserver(average);
		criketData.registerObserver(current);
		
		criketData.dataChanged();
		criketData.unregisterOberver(average);
		criketData.dataChanged();

	}

}
