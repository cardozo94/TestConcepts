package oop.patternsdesign.behavioral.templatemethod;

import oop.patternsdesign.behavioral.templatemethod.framework.Criket;
import oop.patternsdesign.behavioral.templatemethod.framework.Football;
import oop.patternsdesign.behavioral.templatemethod.framework.Game;

public class TemplatePatternDemo {

	//This example is base on /OOP/resources/behavioral/template_pattern_uml_diagram.jpg
	public static void main(String[] args) {
		Game game = new Criket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}
