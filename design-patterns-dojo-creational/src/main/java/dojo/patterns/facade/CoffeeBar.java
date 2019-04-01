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
		// TODO Arabica GroundCoffee + Milk
	}
	
	public void processCappuccino() {
		// // TODO Robusta GroundCoffee + Whip
	}
	
}
