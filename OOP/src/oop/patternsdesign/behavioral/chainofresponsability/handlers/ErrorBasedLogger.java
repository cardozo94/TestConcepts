package oop.patternsdesign.behavioral.chainofresponsability.handlers;

public class ErrorBasedLogger extends Logger {

	public ErrorBasedLogger(int levels) {
		this.levels = levels;
	}

	@Override
	protected void displayLogInfo(String msg) {
		System.out.println("ERROR LOGGER INFO: "+msg);
	}

}
