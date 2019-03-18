package dojo.patterns;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class AbstractFactoryTest extends AbstractTest {

	@Test
	public void should_send_email() throws Exception {
		configureEmailMessageSenderFactory();
		MessageSender sender = getMessageSender();
		sender.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertEmail("from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	@Test
	public void should_log_email() throws Exception {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		configureLoggerMessageSenderFactory(output);
		MessageSender sender = getMessageSender();
		sender.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertOutput(output, "from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	private void configureEmailMessageSenderFactory() {
		// TODO beállítjuk az EmailMessageSender-t visszaadó gyárat aktuálisnak
	}
	
	private void configureLoggerMessageSenderFactory(ByteArrayOutputStream output) {
		// TODO beállítjuk a LoggerMessageSender-t visszaadó gyárat aktuálisnak
	}
	
	private MessageSender getMessageSender() {
		// TODO elkérjük a gyártól a MessageSender példányt
		return null;
	}
}
