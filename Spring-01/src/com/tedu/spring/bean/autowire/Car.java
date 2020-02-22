package com.tedu.spring.bean.autowire;

public class Car {
	private String brand;
	private Double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Car(String brand, Double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
}
