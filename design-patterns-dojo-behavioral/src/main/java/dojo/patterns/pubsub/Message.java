package dojo.patterns.pubsub;

public class Message {

	private final String text;
	
	public Message(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}
	
}
