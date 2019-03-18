package dojo.patterns;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.Rule;
import org.junit.Test;

import com.github.sleroy.fakesmtp.core.ServerConfiguration;
import com.github.sleroy.junit.mail.server.test.FakeSmtpRule;

public class MessageSenderTest {

	@Rule
	public FakeSmtpRule server = new FakeSmtpRule(
			ServerConfiguration.create()
				.port(2525)
				.charset("UTF-8")
				.userName("user")
				.password("password")
				.relayDomains("localhost")
		);
	
	private ByteArrayOutputStream output;
	
	@Test
	public void should_send_email() throws Exception {
		assertThat(server.mailBox()).isEmpty();
		assertThat(server.isRunning()).isTrue();
		emailSender().sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertEmail("from@localhost", "to@localhost", "Test", "This is a test");
	}
	
	@Test
	public void should_log_message_properties() throws UnsupportedEncodingException {
		emailLogger().sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
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
	
	private EmailMessageLogger emailLogger() {
		EmailMessageLogger logger = new EmailMessageLogger();
		output = new ByteArrayOutputStream();
		logger.setOut(new PrintStream(output));
		return logger;
	}
	
	private void assertEmail(String from, String to, String subject, String text) {
		assertThat(server.mailBox()).hasSize(1);
		assertThat(server.mailBox()).allSatisfy(email -> {
			assertThat(email.getFrom()).isEqualTo(from);
			assertThat(email.getTo()).isEqualTo(to);
			assertThat(email.getSubject()).isEqualTo(subject);
			assertThat(email.getEmailStr()).contains(text);
		});
	}
	
	private void assertOutput(ByteArrayOutputStream output, String from, String to, String subject, String text) throws UnsupportedEncodingException {
		String result = output.toString("UTF-8");
		assertThat(result).contains("From: " + from);
		assertThat(result).contains("To: " + to);
		assertThat(result).contains("Subject: " + subject);
		assertThat(result).contains("Message: " + text);
	}
	
}
