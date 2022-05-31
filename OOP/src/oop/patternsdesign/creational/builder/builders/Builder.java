package oop.patternsdesign.creational.builder.builders;

import oop.patternsdesign.creational.builder.cars.CarType;
import oop.patternsdesign.creational.builder.cars.components.Engine;
import oop.patternsdesign.creational.builder.cars.components.GPSNavigator;
import oop.patternsdesign.creational.builder.cars.components.Transmission;
import oop.patternsdesign.creational.builder.cars.components.TripComputer;

public interface Builder {
	
	void setCarType(CarType type);
	void setSeats(int seats);
	void setEngine(Engine engine);
	void setTransmission(Transmission transmission);
	void setTripComputer(TripComputer tripComputer);
	void setGPSNavigator(GPSNavigator gpsNavigator);

}
