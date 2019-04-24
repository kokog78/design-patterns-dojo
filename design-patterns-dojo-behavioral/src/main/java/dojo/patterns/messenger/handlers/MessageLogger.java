package dojo.patterns.messenger.handlers;

import dojo.patterns.messenger.User;

/**
 * Az üzenetek adminisztrációjához szolgáló felületet kiszolgáló feldolgozó.
 * Minden üzenetet loggol, kiírja a feladót, a címzettet és az üzenet hosszát.
 */
public class MessageLogger {

	// TODO BaseMessageHandler kiterjesztés: minden esetben végre kell hajtani a parancsot, majd továbbítani kell
	// TODO MessageTransmitter interfész implementációja: a system.log metódust kell hívni
	
	private String getLogMessage(User sender, User recipient, String message) {
		return String.format("%s > %s: %d bytes", sender.getName(), recipient.getName(), message.length());
	}
	
}
