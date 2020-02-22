package com.tedu.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-scope.xml");
		Person p1 = (Person) act.getBean("person");
		System.out.println(p1);
	}

}
