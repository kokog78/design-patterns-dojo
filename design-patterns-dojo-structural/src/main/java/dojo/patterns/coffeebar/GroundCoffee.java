package dojo.patterns.coffeebar;

public class GroundCoffee {

	private final CoffeeType type;
	private final double massInGram;
	
	public GroundCoffee(CoffeeType type, double massInGram) {
		super();
		this.type = type;
		this.massInGram = massInGram;
	}
	
	public double getTotalPrice() {
		return massInGram * getBasePrice();
	}
	
	@Override
	public String toString() {
		return String.format("%s Coffee %.0f gram", type, massInGram);
	}
	
	private double getBasePrice() {
		if (type == CoffeeType.ARABICA) {
			return 10.0;
		} else {
			return 8.0;
		}
	}
	
}
