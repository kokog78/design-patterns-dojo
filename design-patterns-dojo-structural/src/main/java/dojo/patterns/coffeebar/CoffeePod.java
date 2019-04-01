package dojo.patterns.coffeebar;

public class CoffeePod {

	private final CoffeePodKind kind;
	
	private int quantity;

	public CoffeePod(CoffeePodKind kind, int quantity) {
		super();
		this.kind = kind;
		this.quantity = quantity;
	}
	
	public CoffeePodKind getKind() {
		return kind;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getUnitPrice() {
		switch (kind) {
		case COSTA_RICA:
			return 250.0;
		case INDIA:
			return 145.0;
		default:
			return 145.0;
		}
	}
	
}
