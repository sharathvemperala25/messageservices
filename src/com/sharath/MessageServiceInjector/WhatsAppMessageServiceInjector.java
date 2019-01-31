package com.sharath.MessageServiceInjector;

import com.sharath.messageserviceConsumer.MessageConsumerService;
import com.sharath.messageserviceConsumer.MyMessageServiceConsumer;
import com.sharath.messageservices.WhatsAppMesssageService;

public class WhatsAppMessageServiceInjector implements MessageServiceInjector {

	@Override
	public MessageConsumerService getMessageService() {
		MessageConsumerService messageConsumerService = new MyMessageServiceConsumer(new WhatsAppMesssageService());
		
		return messageConsumerService;
	}

}
