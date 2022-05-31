package oop.patternsdesign.creational.builder.builders;

import oop.patternsdesign.creational.builder.cars.Car;
import oop.patternsdesign.creational.builder.cars.CarType;
import oop.patternsdesign.creational.builder.cars.components.Engine;
import oop.patternsdesign.creational.builder.cars.components.GPSNavigator;
import oop.patternsdesign.creational.builder.cars.components.Transmission;
import oop.patternsdesign.creational.builder.cars.components.TripComputer;

public class CarBuilder implements Builder {
	
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	@Override
	public void setCarType(CarType type) {
		this.type = type;
	}

	@Override
	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}
	
	public Car getResult() {
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}

}
