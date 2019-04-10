package dojo.patterns.pizza;

public class Ingredient {

	public final IngredientKind kind;

	public Ingredient(IngredientKind kind) {
		super();
		this.kind = kind;
	};
	
	@Override
	public String toString() {
		return kind.toString();
	}
}
