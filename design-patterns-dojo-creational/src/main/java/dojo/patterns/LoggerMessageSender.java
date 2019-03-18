package dojo.patterns;

import java.io.PrintStream;

public class LoggerMessageSender implements MessageSender {
	
	private PrintStream out = System.out;
	
	public void setOut(PrintStream out) {
		this.out = out;
	}

	@Override
	public void sendMessage(String from, String to, String subject, String textMessage) {
		log("From", from);
		log("To", to);
		log("Subject", subject);
		log("Message", textMessage);
	}
	
	private void log(String propertyName, String propertyValue) {
		String logMsg = String.format("%s: %s", propertyName, propertyValue);
		out.println(logMsg);
	}
	
}
