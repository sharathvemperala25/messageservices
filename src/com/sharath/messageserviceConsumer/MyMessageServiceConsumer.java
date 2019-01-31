package com.sharath.messageserviceConsumer;

import com.sharath.messageservices.MessageService;

public class MyMessageServiceConsumer implements MessageConsumerService {
	private MessageService messageService;
	public MyMessageServiceConsumer(MessageService messageService) {
		this.messageService = messageService;
	}
	@Override
	public void getMessage() {
		messageService.sendMessage();
		
	}
	

}
