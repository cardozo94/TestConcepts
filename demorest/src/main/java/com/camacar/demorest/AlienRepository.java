package com.camacar.demorest;

/**
 * Class emulating a DDBB
 * @author cristian.cardozo
 *
 */

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	private List<Alien> repositoryAlien;

	public AlienRepository() {

		repositoryAlien = new ArrayList<Alien>();

		Alien a1 = new Alien();
		a1.setName("Camilo");
		a1.setPoints(100);
		a1.setId(1);

		Alien a2 = new Alien();
		a2.setName("Briyith");
		a2.setPoints(1000);
		a2.setId(2);

		repositoryAlien.add(a1);
		repositoryAlien.add(a2);
	}

	public List<Alien> getAliens() {
		return repositoryAlien;
	}

	public Alien getAlien(int id) {
		for (Alien alien : repositoryAlien) {
			if (alien.getId() == id) {
				return alien;
			}
		}
		return new Alien();
	}

	public void creteAlien(Alien alien) {
		repositoryAlien.add(alien);
	}

}
