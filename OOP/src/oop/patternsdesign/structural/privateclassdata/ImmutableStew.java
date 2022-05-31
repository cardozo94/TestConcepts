package oop.patternsdesign.structural.privateclassdata;

public class ImmutableStew {

	private final StewData data;

	public ImmutableStew(int numPotatoes, int numCarrots, int numMeat, int numPeppers) {
		data = new StewData(numPotatoes, numCarrots, numMeat, numPeppers);
	}

	public void mix() {
		System.out.println("Mixing the stew we find : " + data.getNumPotatoes() + " potatoes, " + data.getNumCarrots()
				+ " carrots, " + data.getNumMeat() + " meat, " + data.getNumPeppers() + " peppers");
	}
}
