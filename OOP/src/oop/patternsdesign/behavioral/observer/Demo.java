package oop.patternsdesign.behavioral.observer;

import oop.patternsdesign.behavioral.observer.observers.EmailNotificationListener;
import oop.patternsdesign.behavioral.observer.observers.LogOpenListener;
import oop.patternsdesign.behavioral.observer.subjects.Editor;

public class Demo {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.events.subscribe("open", new LogOpenListener("logFileObserver.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("camilo@example.com"));
		
		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
