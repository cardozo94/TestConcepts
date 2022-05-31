package oop.patternsdesign.creational.factorymethod.factory;

import oop.patternsdesign.creational.factorymethod.products.Button;

public abstract class Dialog {
	
	public void renderWindow(){
		Button okButton = createButton();
		okButton.render();
	}
	
	public abstract Button createButton();

}
