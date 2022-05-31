package oop.patternsdesign.structural.flyweight;

import java.util.Random;

import oop.patternsdesign.structural.flyweight.factory.PlayerFactory;
import oop.patternsdesign.structural.flyweight.object.Player;

//Driver class
public class CounterStrike {
	
    // All player types and weapon (used by getRandPlayerType()
    // and getRandWeapon()
	private static String[] playerType = {"Terrorist", "CounterTerrorist"};
	private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

	//This example is base on /OOP/resources/structural/flyweight.jpg
	public static void main(String[] args) {
		 long start = System.currentTimeMillis();
		/* Assume that we have a total of 10 players
        in the game. */
		for (int i = 0; i < 10_000_000; i++) {
			/* getPlayer() is called simply using the class
            name since the method is a static one */
			Player p = PlayerFactory.getPlayer(getRandomPlayerType());
			/* Assign a weapon chosen randomly uniformly
            from the weapon array  */
			p.assignWeapon(getRandomWeapon());
			 // Send this player on a mission
			p.mission();
		}

	    long end = System.currentTimeMillis();

	    System.out.println((end - start) + " ms");
	}
	
	// Utility methods to get a random player type and
    // weapon
	public static String getRandomPlayerType() {
		Random r = new Random();
		 // Will return an integer between [0,2)
		int randomInt = r.nextInt(playerType.length);
		// return the player stored at index 'randInt'
		return playerType[randomInt];	
	}
	
	public static String getRandomWeapon() {
		Random r = new Random();
		int randomInt = r.nextInt(weapons.length);
		return weapons[randomInt];	
	}

}
