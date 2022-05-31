package oop.patternsdesign.behavioral.strategy.strategies;

public interface PayStrategy {

	boolean pay(int paymentAmount);
	void CollectPaymentDetails();
}
