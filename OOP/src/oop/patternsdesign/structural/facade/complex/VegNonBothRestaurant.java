package oop.patternsdesign.structural.facade.complex;

public class VegNonBothRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		Both b = new Both();
		return b;
	}

}
