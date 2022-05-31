package oop.patternsdesign.behavioral.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import oop.patternsdesign.behavioral.mediator.MediatorIII;

public class SaveButton extends JButton implements Component {
	
	private MediatorIII mediator;
	
	public SaveButton() {
		super("save");
	}

	@Override
	public void setMediator(MediatorIII mediator) {
		this.mediator = mediator;
	}
	
	@Override
	protected void fireActionPerformed(ActionEvent actionEvent) {
		mediator.saveChanges();
	}
	
	@Override
	public String getName() {
		return "SaveButton";
	}

}
