package dojo.patterns;

import static org.assertj.core.api.Assertions.assertThat;

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
	
	@Test
	public void should_send_email() throws Exception {
		assertThat(server.mailBox()).isEmpty();
		assertThat(server.isRunning()).isTrue();
		emailSender().sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		assertThat(server.mailBox()).hasSize(1);
		assertThat(server.mailBox()).allSatisfy(email -> {
			assertThat(email.getFrom()).isEqualTo("from@localhost");
			assertThat(email.getTo()).isEqualTo("to@localhost");
			assertThat(email.getSubject()).isEqualTo("Test");
			assertThat(email.getEmailStr()).contains("This is a test");
			System.out.println(email.getEmailStr());
		});
	}
	
	@Test
	public void should_log_message_properties() {
		emailLogger().sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
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
		return new EmailMessageLogger();
	}
	
}
