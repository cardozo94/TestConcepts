package oop.patternsdesign.creational.factorymethod.factory;

import oop.patternsdesign.creational.factorymethod.products.Button;
import oop.patternsdesign.creational.factorymethod.products.HtmlButton;

public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		return new HtmlButton();
	}

}
