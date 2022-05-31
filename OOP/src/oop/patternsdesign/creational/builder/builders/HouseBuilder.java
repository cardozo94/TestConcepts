package oop.patternsdesign.creational.builder.builders;

import oop.patternsdesign.creational.builder.houses.House;

public interface HouseBuilder {
	
	public void buildBasement();
	public void buildStructure();
	public void buildRoof();
	public void buildInterior();
	public House getHouse();

}
