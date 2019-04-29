package dojo.patterns.pubsub.channel;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

public class ChannelPublisherImpl implements ChannelPublisher {

	@Override
	public void subscribe(Channel channel, Subscriber subscriber) {
		// TODO feliratkozás a megadott csatornára
	}

	@Override
	public void unsubscribe(Channel channel, Subscriber subscriber) {
		// TODO leiratkozás a megadott csatornáról
	}

	@Override
	public void publish(Channel channel, Message message) {
		// TODO üzenet továbbítása a megadott csatornára feliratkozóknak
	}

}
