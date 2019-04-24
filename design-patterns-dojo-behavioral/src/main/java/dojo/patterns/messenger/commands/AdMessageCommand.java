package dojo.patterns.messenger.commands;

import dojo.patterns.messenger.User;

/**
 * Egy mindenkinek szóló üzenet, aminek van feladója és szövegtörzse.
 */
public class AdMessageCommand {

	// TODO MessageCommand implementáció

	private final User sender;
	private final String message;
	
	public AdMessageCommand(User sender, String message) {
		super();
		this.sender = sender;
		this.message = message;
	}

	public User getSender() {
		return sender;
	}
	
	public String getMessage() {
		return message;
	}
}
