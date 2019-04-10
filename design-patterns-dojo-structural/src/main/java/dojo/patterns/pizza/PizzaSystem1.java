package dojo.patterns.pizza;

public class PizzaSystem1 {

	public String pizza;
	
	public void startPizzaOrder() {
		pizza = "";
	}
	
	public void addTomatoSauce() {
		pizza += "TOMATOSAUCE ";
	}
	
	public void addGarlicSourCream() {
		pizza += "GARLICSOURCREAM ";
	}
	
	public void addMozarella() {
		pizza += "MOZARELLA ";
	}
	
	public void addCorn() {
		pizza += "CORN ";
	}
	
	public void addMushroom() {
		pizza += "MUSHROOM ";
	}
	
	public void addPineapple() {
		pizza += "PINEAPPLE ";
	}
	
	public void addEgg() {
		pizza += "EGG ";
	}
	
	public void addBacon() {
		pizza += "BACON ";
	}
	
	public void addHam() {
		pizza += "HAM ";
	}
	
	public void endPizzaOrder() {
		System.out.println(pizza);
	}
	
	
}
