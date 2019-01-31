package com.sharath.MessageServiceInjector;

import com.sharath.messageserviceConsumer.MessageConsumerService;
import com.sharath.messageserviceConsumer.MyMessageServiceConsumer;
import com.sharath.messageservices.FacebookMessageService;

public class FacebookMessageServiceInjector implements MessageServiceInjector{

	@Override
	public MessageConsumerService getMessageService() {
		MessageConsumerService consumer = new MyMessageServiceConsumer(new FacebookMessageService());
		return consumer;
	}
	
}
