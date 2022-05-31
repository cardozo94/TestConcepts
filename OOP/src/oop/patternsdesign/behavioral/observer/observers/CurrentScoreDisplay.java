package oop.patternsdesign.behavioral.observer.observers;

public class CurrentScoreDisplay implements ObserverII {
	
	private int runs, wickets;
	private float overs;
	
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
		this.wickets = wickets;
		this.overs = overs;
		display();
	}
	public void display() {
		System.out.println("\nCurrent Score Display:\nRuns: "+runs+"\nWickets: "+wickets+"\nOvers: "+overs);
	}

}
