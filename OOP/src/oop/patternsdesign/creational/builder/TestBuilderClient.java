package oop.patternsdesign.creational.builder;

import oop.patternsdesign.creational.builder.builders.HouseBuilder;
import oop.patternsdesign.creational.builder.builders.IglooHouseBuilder;
import oop.patternsdesign.creational.builder.directors.CivilEngineer;
import oop.patternsdesign.creational.builder.houses.House;

public class TestBuilderClient {

	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);
		
		engineer.constructHouse();
		
		House house = engineer.getHouse();
		
		System.out.println("Builder constructed: \n"+house.toString());
	}
	
}
