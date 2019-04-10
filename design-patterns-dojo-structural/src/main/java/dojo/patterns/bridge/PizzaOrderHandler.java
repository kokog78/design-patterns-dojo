package dojo.patterns.bridge;

import dojo.patterns.pizza.Ingredient;

public interface PizzaOrderHandler {

	public void newOrder(Ingredient ... ingredients);
	
}
