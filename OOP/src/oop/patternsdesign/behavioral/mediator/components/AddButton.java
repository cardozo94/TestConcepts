package oop.patternsdesign.behavioral.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import oop.patternsdesign.behavioral.mediator.MediatorIII;

public class AddButton extends JButton implements Component {
	
	private MediatorIII mediator;
	
	public AddButton() {
		super("Add");
	}

	@Override
	public void setMediator(MediatorIII mediator) {
		this.mediator = mediator;

	}
	
	@Override 
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.addNewNote(new Note());
	}
	
	@Override
	public String getName() {
		return "AddButton";
	}

}
