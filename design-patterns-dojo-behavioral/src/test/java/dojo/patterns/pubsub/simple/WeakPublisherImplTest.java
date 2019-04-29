package dojo.patterns.pubsub.simple;

import org.junit.Test;

public class WeakPublisherImplTest extends SimplePublisherImplTest {

	@Test
	public void should_not_deliver_to_deprecated_subscriber() throws Exception {
		pubsub.subscribe(subscriber());
		pubsub.publish(message("test"));
		assertMessageNotDelivered("test");
	}
	
	@Override
	protected SimplePublisher publisher() {
		return new WeakPublisherImpl();
	}

}
