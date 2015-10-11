package com.zgsoft.tutorials.rpc.consumer;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zgsoft.tutorials.rpc.api.MessageController;

@Component
public class MessageAction {

	@Reference(version="1.0.0")
    private MessageController messageController;
	
	public void send(String from, String to, String body){
		messageController.send(from, to, body);
	}
	
}
