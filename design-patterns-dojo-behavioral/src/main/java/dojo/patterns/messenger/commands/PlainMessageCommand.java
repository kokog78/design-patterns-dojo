package dojo.patterns.messenger.commands;

import dojo.patterns.messenger.User;

/**
 * Egy egyszerű üzenet, aminek van feladója, címzettje, és egy szövegtörzse.
 */
public class PlainMessageCommand {
	
	// TODO MessageCommand implementáció

	private final User sender;
	private final User recipient;
	private final String message;
	
	public PlainMessageCommand(User sender, User recipient, String message) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.message = message;
	}
	
	public User getSender() {
		return sender;
	}
	
	public User getRecipient() {
		return recipient;
	}
	
	public String getMessage() {
		return message;
	}
	
}
