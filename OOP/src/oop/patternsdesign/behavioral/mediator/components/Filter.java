package oop.patternsdesign.behavioral.mediator.components;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JTextField;
import javax.swing.ListModel;

import oop.patternsdesign.behavioral.mediator.MediatorIII;

public class Filter extends JTextField implements Component {
	
	private MediatorIII mediator;
	private ListModel listModel;
	
	public Filter() {
	}

	@Override
	public void setMediator(MediatorIII mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void processComponentKeyEvent(KeyEvent keyEvent) {
		String start = getText();
		searchElemets(start);
	}
	
	public void setList(ListModel listModel) {
		this.listModel = listModel;
	}
	
	private void searchElemets(String s) {
		if(listModel== null)
			return;
		if(s.equals("")) {
			mediator.setElementsList(listModel);
			return;
		}
		ArrayList<Note> notes = new ArrayList<Note>();
		for (int i = 0; i < listModel.getSize(); i++) {
			notes.add((Note)listModel.getElementAt(i));
		}
		DefaultListModel<Note> listModel = new DefaultListModel<Note>();
		for (Note note : notes) {
			if(note.getName().contains(s))
				listModel.addElement(note);
		}
		mediator.setElementsList(listModel);
	}
	
	@Override 
	public String getName() {
		return "Filter";
	}
}
