package oop.patternsdesign.behavioral.templatemethod;

import oop.patternsdesign.behavioral.templatemethod.framework.Generalization;
import oop.patternsdesign.behavioral.templatemethod.framework.Realization;

public class TemplateMethodDemo {

	public static void main(String[] args) {
		Generalization algorithm = new Realization();
		algorithm.findSolution();
	}

}
