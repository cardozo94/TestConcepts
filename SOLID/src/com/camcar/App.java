package com.camcar;

public class App {
	public static void main(String[] args) {
		HondaCar car = new HondaCar();
		car.setColor("Rojo");
		car.setEngine("Faster");
		car.setNumberDoors(2);
		testCars(car);
		
	}

	public static void testCars(Car car) {
		car.start();
		for(int i = 0; i<45;i++) {
			int random = (int) (Math.random()*100);
			if((random%2)== 0) {
				car.speedUp(random);
			}else {
				car.speedDown(random);
			}
		}
//		car.shiftUpGear();
//		car.shiftUpGear();
//		car.shiftDownGear();
//		car.shiftDownGear();
//		car.shiftDownGear();
		car.park();
		car.turnOff();
	}
}
