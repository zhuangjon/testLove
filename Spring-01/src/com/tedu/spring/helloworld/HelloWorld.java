package com.tedu.spring.helloworld;

public class HelloWorld {
	private String name;
	private Integer age;
	private Double height;
	
	public void hello() {
		System.out.println("Hello World!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	
	public HelloWorld(String name, Integer age, Double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public HelloWorld(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public HelloWorld(String name, Double height) {
		super();
		this.name = name;
		this.height = height;
	}

	public HelloWorld() {
		super();
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
	
	
	
}
