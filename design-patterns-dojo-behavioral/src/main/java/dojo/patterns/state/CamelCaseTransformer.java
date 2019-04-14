package dojo.patterns.state;

public class CamelCaseTransformer {

	private CamelCaseTransformerState state;
	
	public String transform(String text) {
		// TODO az algoritmus használja a state példányt
		return null;
	}
	
	public void setState(CamelCaseTransformerState state) {
		this.state = state;
	}
	
}
