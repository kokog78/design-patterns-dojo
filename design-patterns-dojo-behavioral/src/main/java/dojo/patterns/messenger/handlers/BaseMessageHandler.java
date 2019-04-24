package dojo.patterns.messenger.handlers;

import dojo.patterns.messenger.MessagingSystem;

abstract class BaseMessageHandler {

	// TODO alapértelmezett MessageHandler implementáció
	// TODO next mező, setNext metódus
	
	protected final MessagingSystem system;

	public BaseMessageHandler(MessagingSystem system) {
		super();
		this.system = system;
	}
	
}
