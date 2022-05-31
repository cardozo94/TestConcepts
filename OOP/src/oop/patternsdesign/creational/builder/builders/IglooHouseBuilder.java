package oop.patternsdesign.creational.builder.builders;

import oop.patternsdesign.creational.builder.houses.House;

public class IglooHouseBuilder implements HouseBuilder {

	private House house;
	
	public IglooHouseBuilder() {
		this.house = new House();
	}
	
	@Override
	public void buildBasement() {
		house.setBasement("Ice Bars");

	}

	@Override
	public void buildStructure() {
		house.setStructure("Ice Blocks");
	}

	@Override
	public void buildRoof() {
		house.setInterior("Ice Carvings");
	}

	@Override
	public void buildInterior() {
		house.setRoof("Ice Dome");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
