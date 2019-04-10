package dojo.patterns.bridge;

public abstract class Pizza {

	protected final PizzaOrderHandler handler;

	public Pizza(PizzaOrderHandler handler) {
		super();
		this.handler = handler;
	}
	
}
