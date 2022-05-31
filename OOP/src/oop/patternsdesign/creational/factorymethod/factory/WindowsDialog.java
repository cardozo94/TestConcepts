package oop.patternsdesign.creational.factorymethod.factory;

import oop.patternsdesign.creational.factorymethod.products.Button;
import oop.patternsdesign.creational.factorymethod.products.WidowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WidowsButton();
	}

}
