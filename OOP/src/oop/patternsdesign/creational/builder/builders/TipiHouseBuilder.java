package oop.patternsdesign.creational.builder.builders;

import oop.patternsdesign.creational.builder.houses.House;

public class TipiHouseBuilder implements HouseBuilder {

	private House house;

	public TipiHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Wooden Poles");

	}

	@Override
	public void buildStructure() {
		house.setStructure("Wood and Ice");
	}

	@Override
	public void buildRoof() {
		house.setInterior("Fire Wood");
	}

	@Override
	public void buildInterior() {
		house.setRoof("Wood, caribou and seal skins");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
