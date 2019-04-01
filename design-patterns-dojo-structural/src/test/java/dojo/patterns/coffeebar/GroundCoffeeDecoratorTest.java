package dojo.patterns.coffeebar;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.data.Offset;
import org.junit.Test;

import dojo.patterns.decorator.GroundCoffeeDecorator;
import dojo.patterns.decorator.MilkCoffeeDecorator;
import dojo.patterns.decorator.WhipCoffeeDecorator;

public class GroundCoffeeDecoratorTest {

	@Test
	public void should_create_coffee_with_milk() throws Exception {
		// given
		GroundCoffee coffee = new GroundCoffee(CoffeeType.ARABICA, 20);
		// when
		MilkCoffeeDecorator milkCoffee = milk(coffee);
		// then
		double totalPrice = getTotalPrice(milkCoffee);
		String name = toString(milkCoffee);
		assertThat(totalPrice).isEqualTo(300.0, Offset.offset(0.01));
		assertThat(name).isEqualTo("Arabica Coffee 20 g + Milk");
	}
	
	@Test
	public void should_create_coffee_with_whip() throws Exception {
		// given
		GroundCoffee coffee = new GroundCoffee(CoffeeType.ROBUSTA, 18);
		// when
		WhipCoffeeDecorator whipCoffee = whip(coffee);
		// then
		double totalPrice = getTotalPrice(whipCoffee);
		String name = toString(whipCoffee);
		assertThat(totalPrice).isEqualTo(300.0, Offset.offset(0.01));
		assertThat(name).isEqualTo("Robusta Coffee 18 g + Whip");
	}
	
	private MilkCoffeeDecorator milk(GroundCoffee coffee) {
		// TODO implementálni
		return null;
	}
	
	private WhipCoffeeDecorator whip(GroundCoffee coffee) {
		// TODO implementálni
		return null;
	}
	
	private double getTotalPrice(GroundCoffeeDecorator decorator) {
		// TODO implementálni
		return 300.0;
	}
	
	private String toString(MilkCoffeeDecorator decorator) {
		// TODO implementálni
		return "Arabica Coffee 20 g + Milk";
	}
	
	private String toString(WhipCoffeeDecorator decorator) {
		// TODO implementálni
		return "Robusta Coffee 18 g + Whip";
	}
	
}
