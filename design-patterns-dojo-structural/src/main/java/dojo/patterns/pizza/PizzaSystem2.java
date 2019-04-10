package dojo.patterns.pizza;

public class PizzaSystem2 {

	public void createPizzaOrder(IngredientKind ... ingredients) {
		System.out.println("New pizza:");
		for (IngredientKind ingredient : ingredients) {
			System.out.println("\t" + ingredient);
		}
	}
	
}
