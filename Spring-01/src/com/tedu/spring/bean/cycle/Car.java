package com.tedu.spring.bean.cycle;

public class Car {
	private String brand;
	private Double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
		System.out.println("brand set...");
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
		System.out.println("price set...");
	}
	public Car(String brand, Double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Car() {
		System.out.println("Car constructor...");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("init-method...");
	}
	public void destory() {
		System.out.println("destory-method...");
	}
	
}
