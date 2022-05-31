package oop.patternsdesign.behavioral.chainofresponsability.client;

import oop.patternsdesign.behavioral.chainofresponsability.handlers.ConsoleBasedLogger;
import oop.patternsdesign.behavioral.chainofresponsability.handlers.DebugBasedLogger;
import oop.patternsdesign.behavioral.chainofresponsability.handlers.ErrorBasedLogger;
import oop.patternsdesign.behavioral.chainofresponsability.handlers.Logger;

public class ChainofResponsabilityClient {
	
	private static Logger doChaining() {
		Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
		Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
		consoleLogger.setNextLevelLogger(errorLogger);
		Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
		errorLogger.setNextLevelLogger(debugLogger);
		return consoleLogger;
	}

	//This example is base on /OOP/resources/behavioral/chainofresponsibilityuml.jpg
	public static void main(String[] args) {
		Logger chainLogger = doChaining();
		
		chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values");
		chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
		chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is completed");

	}

}
