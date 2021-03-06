package oop.patternsdesign.behavioral.strategy.strategies;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {

	@Override
	public BigDecimal applyDiscount(final BigDecimal amount) {
		return amount.multiply(BigDecimal.valueOf(0.9));
	}

}
