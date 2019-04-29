package dojo.patterns.pubsub.channel;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

public interface ChannelPublisher {

	public void subscribe(Channel channel, Subscriber subscriber);
	
	public void unsubscribe(Channel channel, Subscriber subscriber);
	
	public void publish(Channel channel, Message message);
}
