package dojo.patterns.coffeebar;

public enum CoffeeType {

	ARABICA,
	
	ROBUSTA;
	
	@Override
	public String toString() {
		return name().substring(0, 1) + name().substring(1).toLowerCase();
	}
}
