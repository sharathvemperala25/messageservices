package com.sharath.Test;

import com.sharath.MessageServiceInjector.FacebookMessageServiceInjector;
import com.sharath.MessageServiceInjector.MessageServiceInjector;
import com.sharath.MessageServiceInjector.WhatsAppMessageServiceInjector;
import com.sharath.messageserviceConsumer.MessageConsumerService;

public class Test {
	public static void main(String argv[]) {
		MessageServiceInjector messageServiceInjector = new FacebookMessageServiceInjector();
		MessageConsumerService consumer = messageServiceInjector.getMessageService();
		consumer.getMessage();
		
		messageServiceInjector = new WhatsAppMessageServiceInjector();
		consumer = messageServiceInjector.getMessageService();
		consumer.getMessage();
		
		
	}
}
