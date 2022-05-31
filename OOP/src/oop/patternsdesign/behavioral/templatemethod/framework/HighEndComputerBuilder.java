package oop.patternsdesign.behavioral.templatemethod.framework;

public class HighEndComputerBuilder extends ComputerBuilder {

	@Override
	public void addMotherBoard() {
		computerParts.put("MotherBoard", "High-end MotherBoard");
	}

	@Override
	public void setupMotherBoard() {
		motherBoardSetupstatus.add("Screwing the high-end motherboard to the case.");
		motherBoardSetupstatus.add("Pluging in the power supply connectors.");
		motherBoardSetupstatus.forEach(step -> System.out.println(step));
	}

	@Override
	public void addProcessor() {
		computerParts.put("Processor", "High-end Processor");
	}

}
