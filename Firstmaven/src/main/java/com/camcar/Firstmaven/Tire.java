package com.camcar.Firstmaven;

import org.springframework.stereotype.Component;

@Component
public class Tire {

	private String brand;
	
//	public Tire(String brand) {
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tire [brand=" + brand + "]";
	}
}
