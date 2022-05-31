package oop.patternsdesign.behavioral.strategy.strategies;

public class Order {
	
	private int totalCost = 0;
	private boolean isClosed= false;
	
	public void processOrder(PayStrategy strategy) {
		strategy.CollectPaymentDetails();
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed() {
		isClosed = true;
	}
	
	

}
