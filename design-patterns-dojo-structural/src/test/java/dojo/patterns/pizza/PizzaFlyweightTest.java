package dojo.patterns.pizza;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import dojo.patterns.bridge.PizzaOrderHandler;
import dojo.patterns.flyweight.HawaiiPizza;
import dojo.patterns.flyweight.IngredientFactory;

public class PizzaFlyweightTest {

	private IngredientFactory factory = new IngredientFactory();
	private Ingredient[] ingredients;
	private PizzaOrderHandler handler = (Ingredient ... ingredients) -> {
		this.ingredients = ingredients;
	};
	
	@Before
	public void init() {
		ingredients = null;
	}
	
	@Test
	public void should_create_and_share_object() throws Exception {
		HawaiiPizza pizza = createHawaiiPizza();
		orderPizza(pizza);
		Ingredient[] cachedIngredients = Arrays.copyOf(ingredients, ingredients.length);
		orderPizza(pizza);
		assertThat(ingredients).containsExactly(cachedIngredients);
	}
	
	private HawaiiPizza createHawaiiPizza() {
		// TODO pizza elkészítése
		return null;
	}
	
	private void orderPizza(HawaiiPizza pizza) {
		// TODO pizza megrendelése
	}
	
}
