package oop.patternsdesign.structural.privateclassdata;

public class Demo {

	//This example is base on /OOP/resources/structural/private-class-data.png
	public static void main(String[] args) {
		Stew stew = new Stew(1, 2, 3, 4);
		stew.mix();
		stew.taste();
		stew.mix();
		
		ImmutableStew immStew = new ImmutableStew(2, 4, 3, 6);
		immStew.mix();
	}
}
