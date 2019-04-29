package dojo.patterns.pubsub.simple;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dojo.patterns.pubsub.Message;
import dojo.patterns.pubsub.Subscriber;

public class SimplePublisherImplTest {

	private SimplePublisherImpl pubsub;
	private List<Message> messages;
	
	@Before
	public void init() {
		pubsub = new SimplePublisherImpl();
		messages = new ArrayList<>();
	}
	
	@Test
	public void subscribe_should_throw_exception_for_null() throws Exception {
		assertThatThrownBy(() -> pubsub.subscribe(null)).isInstanceOf(NullPointerException.class);
	}
	
	@Test
	public void unsubscribe_should_throw_exception_for_null() throws Exception {
		assertThatThrownBy(() -> pubsub.unsubscribe(null)).isInstanceOf(NullPointerException.class);
	}
	
	@Test
	public void publish_should_throw_exception_for_null() throws Exception {
		assertThatThrownBy(() -> pubsub.publish(null)).isInstanceOf(NullPointerException.class);
	}
	
	@Test
	public void should_not_deliver_message_without_subscription() throws Exception {
		pubsub.publish(message("test"));
		assertMessageNotDelivered("test");
	}
	
	@Test
	public void should_deliver_message_to_subscriber() throws Exception {
		Subscriber subscriber = subscriber();
		pubsub.subscribe(subscriber);
		pubsub.publish(message("test"));
		assertMessageDelivered("test");
	}
	
	@Test
	public void should_deliver_message_to_subscriber_only_once() throws Exception {
		Subscriber subscriber = subscriber();
		pubsub.subscribe(subscriber);
		pubsub.subscribe(subscriber);
		pubsub.publish(message("test"));
		assertMessageDelivered("test");
	}
	
	@Test
	public void should_deliver_message_to_multiple_subscribers() throws Exception {
		Subscriber subscriber1 = subscriber();
		Subscriber subscriber2 = subscriber();
		pubsub.subscribe(subscriber1);
		pubsub.subscribe(subscriber2);
		pubsub.publish(message("test"));
		assertMessageDelivered("test", "test");
	}
	
	@Test
	public void should_unsubscribe_subscriber() throws Exception {
		Subscriber subscriber = subscriber();
		pubsub.subscribe(subscriber);
		pubsub.unsubscribe(subscriber);
		pubsub.publish(message("test"));
		assertMessageNotDelivered("test");
	}
	
	@Test
	public void should_unsubscribe_subscriber_twice() throws Exception {
		Subscriber subscriber = subscriber();
		pubsub.subscribe(subscriber);
		pubsub.subscribe(subscriber);
		pubsub.unsubscribe(subscriber);
		pubsub.publish(message("test"));
		assertMessageNotDelivered("test");
	}
	
	private Subscriber subscriber() {
		return (msg) -> this.messages.add(msg);
	}
	
	private Message message(String text) {
		return new Message(text);
	}
	
	private void assertMessageNotDelivered(String ... expectedTexts) {
		assertThat(messages).extracting(msg -> msg.getText()).doesNotContain(expectedTexts);
	}
	
	private void assertMessageDelivered(String ... expectedTexts) {
		assertThat(messages).extracting(msg -> msg.getText()).containsExactly(expectedTexts);
	}
	
}
