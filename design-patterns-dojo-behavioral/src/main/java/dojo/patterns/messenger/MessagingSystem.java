package dojo.patterns.messenger;

public interface MessagingSystem {

	public default void send(User sender, User recipient, String message) {
		System.out.println(String.format("(%s) %s: %s", recipient.getName(), sender.getName(), message));
	}
	
	public default void log(String message) {
		System.out.println(message);
	};
	
}
