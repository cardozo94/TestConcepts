package oop.patternsdesign.creational.factorymethod;

import oop.patternsdesign.creational.factorymethod.factory.Dialog;
import oop.patternsdesign.creational.factorymethod.factory.HtmlDialog;
import oop.patternsdesign.creational.factorymethod.factory.WindowsDialog;

public class Demo {

	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}
	
	static void configure() {
		if(System.getProperty("os.name").equals("Windows 10")) 
			dialog = new WindowsDialog();
		else
			dialog = new HtmlDialog();
	}
	
	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
