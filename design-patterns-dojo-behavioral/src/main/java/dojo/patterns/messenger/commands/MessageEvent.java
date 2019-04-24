package dojo.patterns.messenger.commands;

import java.util.Date;

import dojo.patterns.messenger.MessageTransmitter;
import dojo.patterns.messenger.User;

public class MessageEvent {

	private final User recipient;
	private final MessageCommand command;
	private final Date createdDate;
	private boolean error;
	private Date processedDate;
	
	public MessageEvent(User recipient, MessageCommand command) {
		super();
		this.recipient = recipient;
		this.command = command;
		this.createdDate = new Date();
	}
	
	public User getRecipient() {
		return recipient;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
	
	public boolean isError() {
		return error;
	}
	
	public Date getProcessedDate() {
		return processedDate;
	}
	
	public void processEvent(MessageTransmitter transmitter) {
		// TODO command.apply metódus ellenőrzött meghívása
		// TODO kivétel esetén állítsa be az error mezőt és dobja tovább a kivételt
		// TODO minden esetben töltse ki a processedDate mezőt
	}
	
}
