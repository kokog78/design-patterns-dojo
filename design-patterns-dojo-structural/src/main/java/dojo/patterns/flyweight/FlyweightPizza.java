package dojo.patterns.flyweight;

import dojo.patterns.bridge.Pizza;
import dojo.patterns.bridge.PizzaOrderHandler;

public class FlyweightPizza extends Pizza {

	protected final IngredientFactory factory;

	public FlyweightPizza(PizzaOrderHandler handler, IngredientFactory factory) {
		super(handler);
		this.factory = factory;
	}
	
}
