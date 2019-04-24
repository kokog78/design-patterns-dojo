package dojo.patterns.messenger.commands;

import dojo.patterns.messenger.User;

/**
 * Egy felhasználónak szóló emlékeztető. Van címzettje és szövegtörzse.
 */
public class ReminderMessageCommand {

	// TODO MessageCommand implementáció

	private final User recipient;
	private final String message;
	
	public ReminderMessageCommand(User recipient, String message) {
		super();
		this.recipient = recipient;
		this.message = message;
	}

	public User getRecipient() {
		return recipient;
	}
	
	public String getMessage() {
		return message;
	}

}
