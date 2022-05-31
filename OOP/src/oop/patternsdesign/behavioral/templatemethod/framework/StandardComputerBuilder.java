package oop.patternsdesign.behavioral.templatemethod.framework;

public class StandardComputerBuilder extends ComputerBuilder {

	@Override
	public void addMotherBoard() {
		computerParts.put("MotherBoard", "Standard MotherBoard");

	}

	@Override
	public void setupMotherBoard() {
		motherBoardSetupstatus.add("Screwing the standard motherboard to the case.");
		motherBoardSetupstatus.add("Pluging in the power supply connectors.");
		motherBoardSetupstatus.forEach(step -> System.out.println(step));

	}

	@Override
	public void addProcessor() {
		computerParts.put("Processor", "Standard Processor");
	}

}
