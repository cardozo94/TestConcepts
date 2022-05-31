package oop.patternsdesign.behavioral.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import oop.patternsdesign.behavioral.mediator.MediatorIII;

public class DeleteButton extends JButton implements Component {
	
	private MediatorIII mediator;
	
	public DeleteButton() {
		super("Del");
	}

	@Override
	public void setMediator(MediatorIII mediator) {
		this.mediator = mediator;
	}
	
	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.deleteNote();
	}
	
	@Override
	public String getName() {
		return "DelButton";
	}

}
