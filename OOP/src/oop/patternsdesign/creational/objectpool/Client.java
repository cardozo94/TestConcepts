package oop.patternsdesign.creational.objectpool;

import oop.patternsdesign.creational.objectpool.object.Oliphaunt;
import oop.patternsdesign.creational.objectpool.pool.OliphauntPool;

public class Client {

	//This example is base on /OOP/resources/creational/object-pool.png
	public static void main(String[] args) {
		OliphauntPool pool = new OliphauntPool();
		System.out.println(pool.toString());
		Oliphaunt oliphaunt1 = pool.checkOut();
		System.out.println("Checked out "+oliphaunt1.toString());
		System.out.println(pool.toString());
		Oliphaunt oliphaunt2 = pool.checkOut();
		System.out.println("Checked out "+oliphaunt2.toString());
		System.out.println(pool.toString());
		Oliphaunt oliphaunt3 = pool.checkOut();
		System.out.println("Checked out "+oliphaunt3.toString());
		System.out.println(pool.toString());
		System.out.println("Checking in "+oliphaunt1.toString());
		pool.checkIn(oliphaunt1);
		System.out.println(pool.toString());
		System.out.println("Checking in "+oliphaunt2.toString());
		pool.checkIn(oliphaunt2);
		System.out.println(pool.toString());
		Oliphaunt oliphaunt4 = pool.checkOut();
		System.out.println("Checked out "+oliphaunt4.toString());
		System.out.println(pool.toString());
		Oliphaunt oliphaunt5 = pool.checkOut();
		System.out.println("Checked out "+oliphaunt5.toString());
		System.out.println(pool.toString());
	}

}
