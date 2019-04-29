package dojo.patterns.pubsub;

public interface Subscriber {

	void receiveMessage(Message message);
	
}
