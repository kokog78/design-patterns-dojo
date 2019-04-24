package dojo.patterns.messenger.commands;

import dojo.patterns.messenger.MessageTransmitter;

public interface MessageCommand {

	public void apply(MessageTransmitter transmitter);
	
}
