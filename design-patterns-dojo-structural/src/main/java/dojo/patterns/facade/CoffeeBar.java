package dojo.patterns.facade;

import dojo.patterns.coffeebar.BillingSystem;
import dojo.patterns.coffeebar.OrderingSystem;

public class CoffeeBar {

	private final OrderingSystem orderingSystem;
	private final BillingSystem billingSystem;
	
	public CoffeeBar(OrderingSystem orderingSystem, BillingSystem billingSystem) {
		super();
		this.orderingSystem = orderingSystem;
		this.billingSystem = billingSystem;
	}

	public void processEspresso() {
		// TODO Costa Rica CoffeePod
	}
	
	public void processLatte() {
		// TODO Arabica 20g GroundCoffee + Milk
	}
	
	public void processCappuccino() {
		// // TODO Robusta 20g GroundCoffee + Whip
	}
	
}
