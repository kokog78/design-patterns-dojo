package dojo.patterns.strategy;

public class IdFormatter {
	
	// TODO stratégia beállítása és tárolása

	public String format(String text) {
		// TODO szavak megkeresése
		// TODO stratégia meghívása
		return null;
	}
	
	private String[] getWords(String text) {
		return text.split("\\s+");
	}
	
}
