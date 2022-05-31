package oop.patternsdesign.behavioral.templatemethod.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ComputerBuilder {
	
	protected Map<String, String> computerParts = new HashMap<String, String>();
	protected List<String> motherBoardSetupstatus = new ArrayList<String>();

	public Map<String, String> getComputerParts() {
		return computerParts;
	}

	public List<String> getMotherBoardSetupstatus() {
		return motherBoardSetupstatus;
	}

	public final Computer buildComputer() {
		addMotherBoard();
		setupMotherBoard();
		addProcessor();
		return getComputer();
	}
	
	public abstract void addMotherBoard();
	public abstract void setupMotherBoard();
	public abstract void addProcessor();
	
	private Computer getComputer() {
		return new Computer(computerParts);
	}
}
