package oop.patternsdesign.structural.facade;

import oop.patternsdesign.structural.facade.complex.Both;
import oop.patternsdesign.structural.facade.complex.Hotel;
import oop.patternsdesign.structural.facade.complex.NonVegMenu;
import oop.patternsdesign.structural.facade.complex.NonVegRestaurant;
import oop.patternsdesign.structural.facade.complex.VegMenu;
import oop.patternsdesign.structural.facade.complex.VegNonBothRestaurant;
import oop.patternsdesign.structural.facade.complex.VegRestaurant;

public class HotelKeeper {
	
	public VegMenu getVegMenu() {
		Hotel v = new VegRestaurant();
		VegMenu vegMenu = (VegMenu) v.getMenus();
		return vegMenu;
	}
	
	public NonVegMenu getNonVegMenu() {
		Hotel nv = new NonVegRestaurant();
		NonVegMenu nonVegMenu = (NonVegMenu)nv.getMenus();
		return nonVegMenu;
	}
	
	public Both getVegNonMenu() {
		Hotel b = new VegNonBothRestaurant();
		Both bm = (Both)b.getMenus();
		return bm;
	}

}
