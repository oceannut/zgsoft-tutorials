package com.zgsoft.tutorials.rpc.consumer;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zgsoft.tutorials.rpc.api.DemoController;

@Component
public class DemoAction {

	@Reference(version="1.0.0")
    private DemoController demoController;
	
	public String greeting(String name){
		return demoController.sayHello(name);
	}
	
}
