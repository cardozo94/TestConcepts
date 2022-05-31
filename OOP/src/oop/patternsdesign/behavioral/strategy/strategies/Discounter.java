package oop.patternsdesign.behavioral.strategy.strategies;

import java.math.BigDecimal;

public interface Discounter {
	
	BigDecimal applyDiscount(BigDecimal amount);

}
