package dojo.patterns.pubsub.simple;

import java.util.HashSet;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

/**
 * Egy egyszerű pub-sub implementáció, ami kollekcióban tárolja a feliratkozókat.
 * Tipp: használjunk {@link HashSet}-et, mivel azzal alapból kiszűrhetjük az ismételt
 * tárolást!
 *
 */
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
