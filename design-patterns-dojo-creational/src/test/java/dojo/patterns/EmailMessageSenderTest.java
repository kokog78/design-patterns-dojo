package dojo.patterns;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.github.sleroy.fakesmtp.core.ServerConfiguration;
import com.github.sleroy.junit.mail.server.test.FakeSmtpRule;

public class EmailMessageSenderTest {

	@Rule
	public FakeSmtpRule server = new FakeSmtpRule(
			ServerConfiguration.create()
				.port(2525)
				.charset("UTF-8")
				.userName("user")
				.password("password")
				.relayDomains("localhost")
		);
	
	private EmailMessageSender sender;
	
	@Before
	public void init() {
		sender = new EmailMessageSender();
		sender.setHost("localhost");
		sender.setPort(2525);
		sender.setUsername("user");
		sender.setPassword("password");
	}
	
	@Test
	public void should_send_email() throws Exception {
		assertThat(server.mailBox()).isEmpty();
		assertThat(server.isRunning()).isTrue();
		sender.sendMessage("from@localhost", "to@localhost", "Test", "This is a test");
		System.out.println(server.rejectedMails());
		assertThat(server.mailBox()).hasSize(1);
		assertThat(server.mailBox()).allSatisfy(email -> {
			assertThat(email.getFrom()).isEqualTo("from@localhost");
			assertThat(email.getTo()).isEqualTo("to@localhost");
			assertThat(email.getSubject()).isEqualTo("Test");
			assertThat(email.getEmailStr()).contains("This is a test");
		});
	}
	
}
