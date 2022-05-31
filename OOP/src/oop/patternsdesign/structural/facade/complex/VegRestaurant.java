package oop.patternsdesign.structural.facade.complex;

public class VegRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		VegMenu v = new VegMenu();
		return v;
	}

}
