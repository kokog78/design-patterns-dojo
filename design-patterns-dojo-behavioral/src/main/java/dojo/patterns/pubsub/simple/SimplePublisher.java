package dojo.patterns.pubsub.simple;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

public interface SimplePublisher {

	public void subscribe(Subscriber subscriber);
	
	public void unsubscribe(Subscriber subscriber);
	
	public void publish(Message message);
	
}
