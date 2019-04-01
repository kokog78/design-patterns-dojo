package dojo.patterns.messagesender;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import dojo.patterns.messagesender.MessageSender;

public class BuilderTest extends AbstractTest {

	@Test
	public void should_send_email() throws Exception {
		MessageSender sender = buildEmailMessageSender();
		sender.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertEmail("from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	@Test
	public void should_log_email() throws Exception {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		MessageSender sender = buildLoggerMessageSender(output);
		sender.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertOutput(output, "from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	private MessageSender buildEmailMessageSender() {
		// TODO a MessageSenderBuilder segítségével visszaadjuk az EmailMessageSender-t
		return null;
	}
	
	private MessageSender buildLoggerMessageSender(ByteArrayOutputStream output) {
		// TODO a MessageSenderBuilder segítségével visszaadjuk a LoggerMessageSender-t
		return null;
	}
}
