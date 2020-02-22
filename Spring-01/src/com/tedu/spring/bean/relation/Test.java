package com.tedu.spring.bean.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-relation.xml");
//		Address address = (Address) act.getBean("address");
//		System.out.println(address);
		
		Address address = (Address) act.getBean("address2");
		System.out.println(address);
		
		Person person = (Person) act.getBean("person");
		System.out.println(person);
	}
}
