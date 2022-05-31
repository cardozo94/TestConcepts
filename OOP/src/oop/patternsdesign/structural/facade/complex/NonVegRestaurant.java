package oop.patternsdesign.structural.facade.complex;

public class NonVegRestaurant implements Hotel {

	@Override
	public Menus getMenus() {
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}

}
