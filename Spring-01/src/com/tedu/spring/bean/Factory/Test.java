package com.tedu.spring.bean.Factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ClassPathXmlApplicationContext act = 
			new ClassPathXmlApplicationContext("beans-factory.xml");
	Car car1 = (Car) act.getBean("car1");
	System.out.println(car1);
	Car car2 = (Car) act.getBean("car2");
	System.out.println(car2);
	}
}
