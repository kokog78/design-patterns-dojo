package dojo.patterns.messenger;

public interface MessageTransmitter {
	
	public void transmit(User sender, User recipient, String message);
	
}
