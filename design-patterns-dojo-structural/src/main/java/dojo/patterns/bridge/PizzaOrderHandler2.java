package dojo.patterns.bridge;

import dojo.patterns.pizza.Ingredient;
import dojo.patterns.pizza.PizzaSystem2;

public class PizzaOrderHandler2 implements PizzaOrderHandler {
	
	private final PizzaSystem2 system;

	public PizzaOrderHandler2(PizzaSystem2 system) {
		super();
		this.system = system;
	}

	public void newOrder(Ingredient ... ingredients) {
		// TODO új rendelés feladása
	}

}
