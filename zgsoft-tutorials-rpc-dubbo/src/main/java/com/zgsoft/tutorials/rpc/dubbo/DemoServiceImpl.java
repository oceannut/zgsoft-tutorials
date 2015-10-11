package com.zgsoft.tutorials.rpc.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import com.zgsoft.tutorials.rpc.api.DemoService;

@Service(version="1.0.0")
public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
		return "Hello " + name;
	}

}
