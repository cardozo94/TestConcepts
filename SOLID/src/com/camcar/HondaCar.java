package com.camcar;

public class HondaCar implements ManualCar {
	
	private String color;
	private String engine;
	private int numberDoors;
	private int speed;
	private int gear; //0 neutral, -1 reverse
	
	public HondaCar() {
	
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public int getNumberDoors() {
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors) {
		this.numberDoors = numberDoors;
	}
	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}

	@Override
	public void start() {
		System.out.println("You start your "+color+" Honda");
		speed = 0;
		gear =0;
	}
	@Override
	public void speedUp(int i) {
		speed++;
		System.out.println("You speed up you r"+engine+" Honda engine "+speed+"km/h");
		
	}
	@Override
	public void speedDown(int i) {
		speed--;
		System.out.println("You speed down your "+engine+" Honda engine "+speed+"km/h");
		
	}
	@Override
	public void turnOff() {
		speed =0;
		System.out.println("You turn off your Honda");
		
	}
	@Override
	public void park() {
		System.out.println("You are parking your Honda");		
	}
	@Override
	public void shiftUpGear() {
		if(gear < 7) {
			gear++;
			System.out.println("Going faster "+gear);
		}else {
			System.out.println("Your Honda cannot go forward!!!");
		}
	}
	@Override
	public void shiftDownGear() {
		if(gear > -2) {
			gear--;
			System.out.println("Going slower "+gear);
		}else{
			System.out.println("You are reversing!!!");
		}
		
	}
	
	

}
