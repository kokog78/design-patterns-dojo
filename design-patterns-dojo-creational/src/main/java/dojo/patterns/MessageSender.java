package dojo.patterns;

public interface MessageSender {

	public void sendMessage(String from, String to, String subject, String textMessage) throws Exception;
}
