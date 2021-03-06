package oop.patternsdesign.structural.decorator.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import oop.patternsdesign.structural.decorator.lcdinterface.LCD;

public class Core implements LCD {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public void write(String[] s) {
		System.out.print("INPUT:	");
		try {
			s[0] = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void read(String[] s) {
		System.out.println("Ouput:	"+s[0]);
	}

}
