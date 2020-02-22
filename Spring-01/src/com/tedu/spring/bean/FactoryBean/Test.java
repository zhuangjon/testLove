package com.tedu.spring.bean.FactoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext act = 
				new ClassPathXmlApplicationContext("beans-factoryBean.xml");
		Car car = (Car) act.getBean("car");
		System.out.println(car);
	}
}
