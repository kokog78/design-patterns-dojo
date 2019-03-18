package dojo.patterns;

public class EmailMessageLogger {

	public void sendMessage(String from, String to, String subject, String textMessage) {
		log("From", from);
		log("To", to);
		log("Subject", subject);
		log("Message", textMessage);
	}
	
	private void log(String propertyName, String propertyValue) {
		String logMsg = String.format("%s: %s", propertyName, propertyValue);
		System.out.println(logMsg);
	}
	
}
