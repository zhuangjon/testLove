package com.tedu.spring.bean.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car car = (Car) act.getBean("car");
		System.out.println("使用bean：" + car);
		act.close();
	}
}
