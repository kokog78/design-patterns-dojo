package dojo.patterns.messagesender;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailMessageSender implements MessageSender {

	private String host;
	private int port;
	private String username;
	private String password;
	private boolean useStartTls;
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isUseStartTls() {
		return useStartTls;
	}
	public void setUseStartTls(boolean useStartTls) {
		this.useStartTls = useStartTls;
	}
	
	@Override
	public void sendMessage(String from, String to, String subject, String textMessage) throws AddressException, MessagingException {
		Message message = createMessage(from, to, subject, textMessage);
		Transport.send(message);
	}
	
	private Message createMessage(String from, String to, String subject, String textMessage) throws AddressException, MessagingException {
		Message message = new MimeMessage(createSession());
		message.setFrom(new InternetAddress(from));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		message.setSubject(subject);
		message.setContent(textMessage, "text/plain; charset=UTF-8");
		return message;
	}
	
	private Session createSession() {
		Session session;
		if (username != null && password != null) {
			session = Session.getInstance(createProperties(), new Authenticator() {
			    @Override
			    protected PasswordAuthentication getPasswordAuthentication() {
			        return new PasswordAuthentication(username, password);
			    }
			});
		} else {
			session = Session.getInstance(createProperties());
		}
		return session;
	}
	
	private Properties createProperties() {
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", password != null);
		prop.put("mail.smtp.starttls.enable", Boolean.toString(useStartTls));
		prop.put("mail.smtp.host", host);
		prop.put("mail.smtp.port", Integer.toString(port));
		return prop;
	}
}
