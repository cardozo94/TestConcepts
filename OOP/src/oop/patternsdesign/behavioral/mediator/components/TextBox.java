package oop.patternsdesign.behavioral.mediator.components;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import oop.patternsdesign.behavioral.mediator.MediatorIII;

public class TextBox extends JTextField implements Component {
	
	private MediatorIII mediator;

	@Override
	public void setMediator(MediatorIII mediator) {
		this.mediator = mediator;
	}
	
	@Override
	protected void processComponentKeyEvent(KeyEvent keyEvent) {
		mediator.markNote();
	}
	
	@Override
	public String getName() {
		return "TextBox";
	}

}
