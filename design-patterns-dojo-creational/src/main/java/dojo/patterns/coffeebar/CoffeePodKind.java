package dojo.patterns.coffeebar;

public enum CoffeePodKind {

	COSTA_RICA,
	INDIA,
	COLOMBIA;
	
	@Override
	public String toString() {
		switch (this) {
		case COSTA_RICA:
			return "Costa Rica";
		case INDIA:
			return "India";
		case COLOMBIA:
			return "Colombia";
		}
		return "";
	}
}
