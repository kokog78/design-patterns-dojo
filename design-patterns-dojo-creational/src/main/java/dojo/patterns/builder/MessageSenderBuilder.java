package dojo.patterns.builder;

import dojo.patterns.MessageSender;

public class MessageSenderBuilder implements IMessageSenderBuilder {

	// TODO ebben az osztályban kezeljük az EmailMessageSender és a LoggerMessageSender gyártását is
	// TODO ehhez kelleni fog két metódus, amivel ki lehet választani a megfelelő típust

	public MessageSender build() throws Exception {
		// TODO a többi beállított érték alapján elkészíti a megfelelő MessageSender példányt, és visszaadja
		return null;
	}
	
}
