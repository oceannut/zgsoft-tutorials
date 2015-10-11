package com.zgsoft.tutorials.rpc.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {

	@Autowired
	private DemoAction demoAction;
	
	public void doSomething(){
		String hello = demoAction.greeting("world"); // 执行远程方法
		System.out.println("---------begin---------");
		System.out.println(hello); // 显示调用结果
		System.out.println("---------end---------");
	}
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml" });
		context.start();

		Application app = (Application) context.getBean("application");
		app.doSomething();
		
		System.in.read(); // 按任意键退出
	}

}
