package dojo.patterns.state;

// TODO ennek az osztálynak lesznek a leszármazottjai a konkrét állapotok

public abstract class CamelCaseTransformerState {

	protected final CamelCaseTransformer transformer;

	public CamelCaseTransformerState(CamelCaseTransformer transformer) {
		super();
		this.transformer = transformer;
	}
	
	// TODO egy absztrakt metódus kell, amitt a SnakeCaseTransformer hív
	
	protected String toLowerCase(char c) {
		return Character.toString(Character.toLowerCase(c));
	}
	
	protected String toUpperCase(char c) {
		return Character.toString(Character.toUpperCase(c));
	}
	
}
