package oop.patternsdesign.creational.builder;

import oop.patternsdesign.creational.builder.builders.CarBuilder;
import oop.patternsdesign.creational.builder.builders.CarManualBuilder;
import oop.patternsdesign.creational.builder.cars.Car;
import oop.patternsdesign.creational.builder.cars.Manual;
import oop.patternsdesign.creational.builder.directors.Director;

public class Demo {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		
		Car car = builder.getResult();
		System.out.println("Car built:\n"+car.getCarType());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		System.out.println("\nCar manual built:\n"+carManual.print());
	}

}
