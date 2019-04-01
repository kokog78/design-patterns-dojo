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
		return type.name().substring(0, 1) + type.name().substring(1).toLowerCase() + " Coffee";
	}
	
	private double getBasePrice() {
		if (type == CoffeeType.ARABICA) {
			return 6.0;
		} else {
			return 4.0;
		}
	}
	
}
