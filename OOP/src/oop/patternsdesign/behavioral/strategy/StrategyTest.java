package oop.patternsdesign.behavioral.strategy;

import java.math.BigDecimal;

import oop.patternsdesign.behavioral.strategy.strategies.ChristmasDiscounter;
import oop.patternsdesign.behavioral.strategy.strategies.Discounter;
import oop.patternsdesign.behavioral.strategy.strategies.EasterDiscounter;

public class StrategyTest {

	public static void main(String[] args) {
		BigDecimal prize = BigDecimal.valueOf(1000);
		Discounter easter = new EasterDiscounter();
		Discounter christmas = new ChristmasDiscounter();

		System.out.println("EasterDiscounter: " + easter.applyDiscount(prize) + "\nChristmasDiscounter: "
				+ christmas.applyDiscount(prize));
	}
}
