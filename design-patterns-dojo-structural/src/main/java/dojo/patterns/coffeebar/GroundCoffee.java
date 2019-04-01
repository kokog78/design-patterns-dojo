package dojo.patterns.coffeebar;

public class GroundCoffee {

	private CoffeeType type;
	private double massInGram;
	
	protected GroundCoffee() {
		// default constructor
	}
	
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
		return String.format("%s Coffee %.0f g", type, massInGram);
	}
	
	private double getBasePrice() {
		if (type == CoffeeType.ARABICA) {
			return 10.0;
		} else {
			return 8.0;
		}
	}
	
}
