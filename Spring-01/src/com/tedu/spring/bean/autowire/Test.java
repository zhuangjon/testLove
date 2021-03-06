package com.tedu.spring.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-autowire.xml");
		Person person = (Person) act.getBean("person");
		System.out.println(person);
	}
}
