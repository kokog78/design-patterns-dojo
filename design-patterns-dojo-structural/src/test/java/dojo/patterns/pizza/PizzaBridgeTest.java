package dojo.patterns.pizza;

import org.junit.Test;

import dojo.patterns.bridge.CarbonaraPizza;
import dojo.patterns.bridge.Pizza;
import dojo.patterns.bridge.PizzaOrderHandler;
import dojo.patterns.bridge.PizzaOrderHandler1;
import dojo.patterns.bridge.PizzaOrderHandler2;

public class PizzaBridgeTest {
	
	private PizzaOrderHandler1 handler1 = new PizzaOrderHandler1(new PizzaSystem1());
	private PizzaOrderHandler2 handler2 = new PizzaOrderHandler2(new PizzaSystem2());

	@Test
	public void order_carbonara_pizza() throws Exception {
		System.out.println("CARBONARA");
		System.out.println("HANDLER 1");
		Pizza pizza = createCarbonaraPizza(handler1);
		pizza.order();
		System.out.println("HANDLER 2");
		pizza = createCarbonaraPizza(handler2);
		pizza.order();
	}
	
	@Test
	public void order_dolce_vita_pizza() throws Exception {
		System.out.println("DOLCE VITA");
		System.out.println("HANDLER 1");
		Pizza pizza = createDolceVitaPizza(handler1);
		pizza.order();
		System.out.println("HANDLER 2");
		pizza = createDolceVitaPizza(handler2);
		pizza.order();
	}
	
	private Pizza createDolceVitaPizza(PizzaOrderHandler handler) {
		// TODO új dolce vita elkészítése
		return null;
	}
	
	private Pizza createCarbonaraPizza(PizzaOrderHandler handler) {
		// TODO új carbonara pizza elkészítése
		return null;
	}
	
}
