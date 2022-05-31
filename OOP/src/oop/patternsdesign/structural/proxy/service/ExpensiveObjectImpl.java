package oop.patternsdesign.structural.proxy.service;

public class ExpensiveObjectImpl implements ExpensiveObject {

	
	public ExpensiveObjectImpl() {
		heavyInitialConfig();
	}
	
	@Override
	public void process() {
		System.out.println("Processing complete.");
	}
	
	private void heavyInitialConfig() {
		System.out.println("Loading initial configuration...");
	}

}
