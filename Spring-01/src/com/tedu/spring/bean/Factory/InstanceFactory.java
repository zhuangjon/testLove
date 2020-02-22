package com.tedu.spring.bean.Factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceFactory {
	private static Map<String,Car> cars = new HashMap<>();
	static {
		cars.put("audi", new Car("audi", 300000.0));
		cars.put("BMW", new Car("BMW", 400000.0));
	}
	public Car getCar(String name) {
		return cars.get(name);
	}
}
