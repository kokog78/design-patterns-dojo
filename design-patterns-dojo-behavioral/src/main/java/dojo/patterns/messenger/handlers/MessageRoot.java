package dojo.patterns.messenger.handlers;

import dojo.patterns.messenger.MessagingSystem;
import dojo.patterns.messenger.commands.MessageEvent;

public class MessageRoot implements MessageHandler {
	
	private final MessageHandler root;

	public MessageRoot(MessagingSystem system) {
		root = createRoot(system);
	}
	
	@Override
	public void handle(MessageEvent event) {
		root.handle(event);
	}

	private MessageHandler createRoot(MessagingSystem system) {
		// TODO MessageLogger, MessageValidator és MessageSender egymásba fűzése
		return null;
	}

}
