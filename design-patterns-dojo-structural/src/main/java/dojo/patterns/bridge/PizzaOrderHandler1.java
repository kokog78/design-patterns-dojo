package dojo.patterns.bridge;

import dojo.patterns.pizza.Ingredient;
import dojo.patterns.pizza.PizzaSystem1;

public class PizzaOrderHandler1 implements PizzaOrderHandler {
	
	private final PizzaSystem1 system;
	
	public PizzaOrderHandler1(PizzaSystem1 system) {
		super();
		this.system = system;
	}

	public void newOrder(Ingredient ... ingredients) {
		// TODO új rendelés feladása
	}

}
