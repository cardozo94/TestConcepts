package oop.patternsdesign.creational.abstractfactory;

import oop.patternsdesign.creational.abstractfactory.colors.*;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String colorType) {
		Color die;
		if("White".equalsIgnoreCase(colorType))
			die = new White();
		else if("Brown".equalsIgnoreCase(colorType))
			die = new Brown();
		else if("Black".equalsIgnoreCase(colorType))
			die = new Black();
		else
			die = null;
		return die;
	}

}
