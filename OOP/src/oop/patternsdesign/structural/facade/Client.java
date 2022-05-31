package oop.patternsdesign.structural.facade;

import oop.patternsdesign.structural.facade.complex.Menus;

public class Client {

	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeper();
		
		Menus v = keeper.getVegMenu();
		Menus nv = keeper.getNonVegMenu();
		Menus b = keeper.getVegNonMenu();
		v.print();
		nv.print();
		b.print();
	}

}
