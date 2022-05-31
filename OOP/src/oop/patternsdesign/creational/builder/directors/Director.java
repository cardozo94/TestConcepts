package oop.patternsdesign.creational.builder.directors;

import oop.patternsdesign.creational.builder.builders.Builder;
import oop.patternsdesign.creational.builder.cars.CarType;
import oop.patternsdesign.creational.builder.cars.components.Engine;
import oop.patternsdesign.creational.builder.cars.components.GPSNavigator;
import oop.patternsdesign.creational.builder.cars.components.Transmission;
import oop.patternsdesign.creational.builder.cars.components.TripComputer;

public class Director {
	
	public void constructSportsCar(Builder builder) {
		builder.setCarType(CarType.SPORTS_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(3.0, 0));
		builder.setTransmission(Transmission.SEMI_AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructCityCar(Builder builder) {
		builder.setCarType(CarType.CITY_CAR);
		builder.setSeats(2);
		builder.setEngine(new Engine(1.2, 0));
		builder.setTransmission(Transmission.AUTOMATIC);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}
	
	public void constructSUV(Builder builder) {
		builder.setCarType(CarType.SUV);
		builder.setSeats(4);
		builder.setEngine(new Engine(2.5, 0));
		builder.setTransmission(Transmission.MANUAL);
		builder.setTripComputer(new TripComputer());
		builder.setGPSNavigator(new GPSNavigator());
	}

}
