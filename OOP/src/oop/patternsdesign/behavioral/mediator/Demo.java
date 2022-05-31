package oop.patternsdesign.behavioral.mediator;

import javax.swing.DefaultListModel;

import oop.patternsdesign.behavioral.mediator.components.AddButton;
import oop.patternsdesign.behavioral.mediator.components.DeleteButton;
import oop.patternsdesign.behavioral.mediator.components.Filter;
import oop.patternsdesign.behavioral.mediator.components.List;
import oop.patternsdesign.behavioral.mediator.components.SaveButton;
import oop.patternsdesign.behavioral.mediator.components.TextBox;
import oop.patternsdesign.behavioral.mediator.components.Title;

public class Demo {

	public static void main(String[] args) {
		MediatorIII mediator = new Editor();
		
		mediator.registerComponent(new Title());
		mediator.registerComponent(new TextBox());
		mediator.registerComponent(new AddButton());
		mediator.registerComponent(new DeleteButton());
		mediator.registerComponent(new SaveButton());
		mediator.registerComponent(new List(new DefaultListModel()));
		mediator.registerComponent(new Filter());
		
		mediator.createGUI();
	}
}
