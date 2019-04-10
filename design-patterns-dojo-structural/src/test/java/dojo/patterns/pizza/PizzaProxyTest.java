package dojo.patterns.pizza;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dojo.patterns.bridge.PizzaOrderHandler;
import dojo.patterns.proxy.PizzaOrderHandlerProxyFactory;

public class PizzaProxyTest {

	private PizzaOrderHandlerProxyFactory factory = new PizzaOrderHandlerProxyFactory();
	private Ingredient[] ingredients;
	private PizzaOrderHandler handler = (Ingredient ... ingredients) -> {
		this.ingredients = ingredients;
	};
	private ByteArrayOutputStream out;
	private PrintStream originalOut;
	
	@Before
	public void init() {
		ingredients = null;
		out = new ByteArrayOutputStream();
		originalOut = System.out;
		System.setOut(new PrintStream(out));
	}
	
	@After
	public void end() {
		System.setOut(originalOut);
	}
	
	@Test
	public void should_create_proxy_instance() throws Exception {
		// given
		Ingredient i1 = ingredient(IngredientKind.GARLICSOURCREAM);
		Ingredient i2 = ingredient(IngredientKind.MOZARELLA);
		Ingredient i3 = ingredient(IngredientKind.BACON);
		PizzaOrderHandler proxy = factory.createProxyFor(handler);
		// when
		proxy.newOrder(i1, i2, i3);
		// then
		assertThat(ingredients).containsExactly(i1, i2, i3);
		assertThat(out.toString("UTF-8"))
			.contains("Class: PizzaOrderHandler")
			.contains("Method: newOrder")
			.contains("Parameter: GARLICSOURCREAM,MOZARELLA,BACON")
			.contains("Result: null");
	}
	
	private Ingredient ingredient(IngredientKind kind) {
		return new Ingredient(kind);
	}
	
}
