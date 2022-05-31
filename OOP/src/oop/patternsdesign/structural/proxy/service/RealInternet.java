package oop.patternsdesign.structural.proxy.service;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverhost) throws Exception {
		System.out.println("Connecting to "+serverhost);
	}

}
