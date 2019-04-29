package dojo.patterns.pubsub.simple;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

public class SimplePublisherImpl implements SimplePublisher {

	@Override
	public void subscribe(Subscriber subscriber) {
		// TODO feliratkozás
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		// TODO leiratkozás
	}

	@Override
	public void publish(Message message) {
		// TODO üzenet küldése a feliratkozóknak
	}

}
