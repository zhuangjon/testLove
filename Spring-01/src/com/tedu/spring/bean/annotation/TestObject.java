package com.tedu.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.tedu.spring.bean.annotation.controller.UserController;
import com.tedu.spring.bean.annotation.dao.UserDaoImpl;
import com.tedu.spring.bean.annotation.service.UserServiceImpl;

@Component
public class TestObject {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		UserController uc = (UserController) act.getBean("userController");
//		System.out.println(uc);
		
		UserServiceImpl usi = (UserServiceImpl) act.getBean("userServiceImpl");
		System.out.println(usi);
		
//		UserDaoImpl udi = (UserDaoImpl) act.getBean("userDaoImpl");
//		System.out.println(udi);
//		
//		TestObject to = (TestObject) act.getBean("testObject");
//		System.out.println(to);
	}
}
