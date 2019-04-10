package dojo.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

import dojo.patterns.pizza.Ingredient;
import dojo.patterns.pizza.IngredientKind;

public class IngredientFactory {

	private final Map<IngredientKind, Ingredient> ingredients = new HashMap<>();
	
	public Ingredient getIngredient(IngredientKind kind) {
		// TODO pehelysúlyú objektum létrehozása / lekérése
		return null;
	}
	
}
