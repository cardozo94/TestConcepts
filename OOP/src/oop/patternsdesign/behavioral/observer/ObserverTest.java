package oop.patternsdesign.behavioral.observer;

import oop.patternsdesign.behavioral.observer.observers.NewsChannel;
import oop.patternsdesign.behavioral.observer.subjects.NewsAgency;

public class ObserverTest {

	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();//Subject
		NewsChannel observer = new NewsChannel();
		observable.addObserver(observer);
		observable.setNews("news");
		System.out.println(observer.getNews());
	}

}
