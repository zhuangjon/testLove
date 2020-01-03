package com.tedu.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	public static void main(String[] args) {
		//加载Spring配置文件
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//从容器中获取bean
		HelloWorld helloWorld = (HelloWorld) act.getBean(HelloWorld.class);
		//调用hello()方法
		//helloWorld.hello();
		
		System.out.println(helloWorld);
	}
}
