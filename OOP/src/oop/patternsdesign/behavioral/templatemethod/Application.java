package oop.patternsdesign.behavioral.templatemethod;

import oop.patternsdesign.behavioral.templatemethod.framework.Computer;
import oop.patternsdesign.behavioral.templatemethod.framework.ComputerBuilder;
import oop.patternsdesign.behavioral.templatemethod.framework.HighEndComputerBuilder;
import oop.patternsdesign.behavioral.templatemethod.framework.StandardComputerBuilder;

public class Application {

	public static void main(String[] args) {
		ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
		Computer standardComputer = standardComputerBuilder.buildComputer();
		standardComputer.getComputerParts().forEach((k, v)->System.out.println("Part: "+k+" Value: "+v));
		
		ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
		Computer highEndComputer = highEndComputerBuilder.buildComputer();
		highEndComputer.getComputerParts().forEach((k, v)-> System.out.println("Part: "+k+" Value: "+v));

	}

}
