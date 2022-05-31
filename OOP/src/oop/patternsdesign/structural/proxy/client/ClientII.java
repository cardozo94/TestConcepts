package oop.patternsdesign.structural.proxy.client;

import oop.patternsdesign.structural.proxy.service.Internet;
import oop.patternsdesign.structural.proxy.service.ProxyInternet;

public class ClientII {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		try {
			internet.connectTo("camilowebpage.com");
			internet.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
