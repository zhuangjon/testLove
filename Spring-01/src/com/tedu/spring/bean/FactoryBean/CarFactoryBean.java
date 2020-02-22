package com.tedu.spring.bean.FactoryBean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Car getObject() throws Exception {
		return new Car(brand, 300000.0);
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
	
}
