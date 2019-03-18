package dojo.patterns;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class FactoryMethodTest extends AbstractTest {

	@Test
	public void should_send_email() throws Exception {
		MessageClient client = createEmailMessageClient();
		client.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertEmail("from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	@Test
	public void should_log_email() throws Exception {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		MessageClient client = createLoggerMessageClient(output);
		client.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertOutput(output, "from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	private MessageClient createEmailMessageClient() {
		// TODO elkészítjük és visszaadjuk az EmailMessageSender-t használó MessageClient-et
		return null;
	}
	
	private MessageClient createLoggerMessageClient(ByteArrayOutputStream output) {
		// TODO elkészítjük és visszaadjuk a LoggerMessageSender-t használó MessageClient-et
		return null;
	}
}
