package com.snraja.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld helloBean = context.getBean(HelloWorld.class);
		// context.getBean(HelloWorld.class) always returns the same object
		// it creates object first time only, next time onwards it sends same reference when invoked
		helloBean.sayHello();
	}

}
