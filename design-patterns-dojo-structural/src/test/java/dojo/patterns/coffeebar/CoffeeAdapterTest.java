package dojo.patterns.coffeebar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

import org.junit.Test;

import dojo.patterns.adapter.CoffeeAdapter;

public class CoffeeAdapterTest {

	@Test
	public void should_create_adapter() throws Exception {
		// given
		CoffeePod pod = new CoffeePod(CoffeePodKind.INDIA, 2);
		// when
		CoffeeAdapter adapter = createAdapterFor(pod);
		// then
		double totalPrice = getTotalPrice(adapter);
		String name = toString(adapter);
		assertThat(totalPrice).isEqualTo(290.0, offset(0.01));
		assertThat(name).isEqualTo("India x 2");
	}
	
	private CoffeeAdapter createAdapterFor(CoffeePod pod) {
		// TODO implementálni
		return null;
	}
	
	private double getTotalPrice(CoffeeAdapter adapter) {
		// TODO implementálni
		return 290.0;
	}
	
	private String toString(CoffeeAdapter adapter) {
		// TODO implementálni
		return "India x 2";
	}
	
}
