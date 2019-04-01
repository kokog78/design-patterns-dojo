package dojo.patterns.coffeebar;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import dojo.patterns.facade.CoffeeBar;

public class CoffeeBarTest {

	private OrderingSystem orderingSystem;
	private BillingSystem billingSystem;
	private CoffeeBar bar;
	
	@Before
	public void init() {
		orderingSystem = mock(OrderingSystem.class);
		billingSystem = mock(BillingSystem.class);
		bar = new CoffeeBar(orderingSystem, billingSystem);
	}
	
	@Test @Ignore
	public void processEspresso_should_order_and_bill_espresso() throws Exception {
		bar.processEspresso();
		verify(orderingSystem).orderProduct("Costa Rica Coffee x 1");
		verify(billingSystem).billItem("Costa Rica Coffee x 1", 250.0);
	}
	
	@Test @Ignore
	public void processLatte_should_order_and_bill_latte() throws Exception {
		bar.processLatte();
		verify(orderingSystem).orderProduct("Arabica Coffee 20g + Milk");
		verify(billingSystem).billItem("Arabica Coffee 20g + Milk", 300.0);
	}
	
	@Test @Ignore
	public void processCappuccino_should_order_and_bill_cappuccino() throws Exception {
		bar.processCappuccino();
		verify(orderingSystem).orderProduct("Robusta Coffee 20g + Whip");
		verify(billingSystem).billItem("Robusta Coffee 20g + Whip", 316.0);
	}
	
}
