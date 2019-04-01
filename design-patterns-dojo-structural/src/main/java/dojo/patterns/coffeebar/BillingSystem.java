package dojo.patterns.coffeebar;

public class BillingSystem {

	public void billItem(String name, double price) {
		System.out.println(String.format("Item: %s, price: %.0f", name, price));
	}
}
