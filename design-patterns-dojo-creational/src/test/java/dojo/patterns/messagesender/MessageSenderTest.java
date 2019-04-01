package dojo.patterns.messagesender;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

import dojo.patterns.messagesender.EmailMessageSender;
import dojo.patterns.messagesender.LoggerMessageSender;

public class MessageSenderTest extends AbstractTest {
	
	@Test
	public void should_send_email() throws Exception {
		assertThat(server.mailBox()).isEmpty();
		assertThat(server.isRunning()).isTrue();
		emailSender().sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertEmail("from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	@Test
	public void should_log_message_properties() throws UnsupportedEncodingException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		emailLogger(output).sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertOutput(output, "from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	private EmailMessageSender emailSender() {
		EmailMessageSender sender = new EmailMessageSender();
		sender.setHost("localhost");
		sender.setPort(2525);
		sender.setUsername("user");
		sender.setPassword("password");
		return sender;
	}
	
	private LoggerMessageSender emailLogger(ByteArrayOutputStream output) {
		LoggerMessageSender logger = new LoggerMessageSender();
		logger.setOut(new PrintStream(output));
		return logger;
	}
	
}
