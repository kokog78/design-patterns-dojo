package dojo.patterns;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

import org.junit.Rule;

import com.github.sleroy.fakesmtp.core.ServerConfiguration;
import com.github.sleroy.junit.mail.server.test.FakeSmtpRule;

public class AbstractTest {

	@Rule
	public FakeSmtpRule server = new FakeSmtpRule(
			ServerConfiguration.create()
				.port(2525)
				.charset("UTF-8")
				.userName("user")
				.password("password")
				.relayDomains("localhost")
		);

	protected void assertEmail(String from, String to, String subject, String text) {
		assertThat(server.mailBox()).hasSize(1);
		assertThat(server.mailBox()).allSatisfy(email -> {
			assertThat(email.getFrom()).isEqualTo(from);
			assertThat(email.getTo()).isEqualTo(to);
			assertThat(email.getSubject()).isEqualTo(subject);
			assertThat(email.getEmailStr()).contains(text);
		});
	}
	
	protected void assertOutput(ByteArrayOutputStream output, String from, String to, String subject, String text) throws UnsupportedEncodingException {
		String result = output.toString("UTF-8");
		assertThat(result).contains("From: " + from);
		assertThat(result).contains("To: " + to);
		assertThat(result).contains("Subject: " + subject);
		assertThat(result).contains("Message: " + text);
	}
	
}
