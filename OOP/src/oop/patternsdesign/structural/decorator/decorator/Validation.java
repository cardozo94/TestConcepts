package oop.patternsdesign.structural.decorator.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oop.patternsdesign.structural.decorator.lcdinterface.LCD;

public class Validation extends Decorator {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public Validation(LCD inner) {
		super(inner);
	}
	
	public void write(String[] s) {
		System.out.println("PASSWORD:	");
		try {
			in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.write(s);
	}
	
	public void read(String[] s) {
		System.out.println("PASSWORD:	");
		try {
			in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		super.read(s);
	}

}
