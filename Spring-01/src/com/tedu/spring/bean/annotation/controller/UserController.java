package com.tedu.spring.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.tedu.spring.bean.annotation.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	public void test(@Qualifier UserService userService) {
		System.out.println(userService);
	}
	
}
