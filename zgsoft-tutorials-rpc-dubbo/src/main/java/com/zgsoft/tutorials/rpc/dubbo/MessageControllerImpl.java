package com.zgsoft.tutorials.rpc.dubbo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgsoft.tutorials.domain.Message;
import com.zgsoft.tutorials.rpc.api.MessageController;
import com.zgsoft.tutorials.service.MessageService;

@Service(version="1.0.0")
public class MessageControllerImpl implements MessageController {

	@Autowired
	private MessageService messageService;
	
	public void send(String from, String to, String body) {
		Message message = new Message();
		message.setId(String.valueOf(System.currentTimeMillis()));
		message.setFrom(from);
		message.setTo(to);
		message.setBody(body);
		message.setTimestamp(new Date());
		
		messageService.save(message);
	}

}
