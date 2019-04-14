package dojo.patterns.state;

// TODO ennek az osztálynak lesznek a leszármazottjai a konkrét állapotok

public abstract class SnakeCaseTransformerState {

	private final SnakeCaseTransformer transformer;

	public SnakeCaseTransformerState(SnakeCaseTransformer transformer) {
		super();
		this.transformer = transformer;
	}
	
	// TODO egy absztrakt metódus kell, amitt a SnakeCaseTransformer hív
	
	protected void setState(SnakeCaseTransformerState state) {
		transformer.setState(state);
	}
	
	protected char toLowerCase(char c) {
		return Character.toLowerCase(c);
	}
	
}
