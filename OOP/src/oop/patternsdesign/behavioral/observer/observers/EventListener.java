package oop.patternsdesign.behavioral.observer.observers;

import java.io.File;

public interface EventListener {

	void update(String eventType, File file);
}
