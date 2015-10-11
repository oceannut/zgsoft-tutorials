package com.zgsoft.tutorials.service.impl;

import org.springframework.stereotype.Service;

import com.zgsoft.tutorials.domain.Message;
import com.zgsoft.tutorials.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	public void save(Message message) {
		if(message != null){
			System.out.println(message.getFrom() + " send "+ message.getBody() + " to "+ message.getTo() + " at "+ message.getTimestamp());
		}
		
	}

}
