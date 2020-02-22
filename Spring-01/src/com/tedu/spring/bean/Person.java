package com.tedu.spring.bean;

import java.util.List;
import java.util.Map;

public class Person {
	private String username;
	private Integer age;
	private List<Car> cars;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", cars=" + cars + "]";
	}
	public Person() {
		super();
	}
	public Person(String username, Integer age, List<Car> cars) {
		super();
		this.username = username;
		this.age = age;
		this.cars = cars;
	}
	
}
