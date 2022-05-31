package oop.patternsdesign.behavioral.mediator;

import javax.swing.ListModel;

import oop.patternsdesign.behavioral.mediator.components.Component;
import oop.patternsdesign.behavioral.mediator.components.Note;

public interface MediatorIII {

	void addNewNote(Note note);
	void deleteNote();
	void getInfoFromList(Note note);
	void saveChanges();
	void markNote();	
	void clear();
	void sendToFilter(ListModel listModel);
	void setElementsList(ListModel list);
	void registerComponent(Component component);
	void hideElement(boolean flag);
	void createGUI();
}
