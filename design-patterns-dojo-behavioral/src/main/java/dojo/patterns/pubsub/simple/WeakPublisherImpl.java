package dojo.patterns.pubsub.simple;

import java.lang.ref.WeakReference;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

/**
 * Ez az osztály {@link WeakReference} segítségével tárolja a feliratkozókat.
 * Így a java szemétgyűjtő automatikusan kidobálja azokat, ha már csak gyenge
 * hivatkozások vannak rájuk a rendszerben. Az osztály mindent tud, amit a
 * {@link SimplePublisherImpl}.
 *
 */
public class WeakPublisherImpl implements SimplePublisher {

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
