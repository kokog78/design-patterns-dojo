package dojo.patterns.messenger.handlers;

import dojo.patterns.messenger.commands.MessageEvent;

public interface MessageHandler {

	public void handle(MessageEvent event);
	
}
