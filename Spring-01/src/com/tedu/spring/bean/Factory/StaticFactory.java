package com.tedu.spring.bean.Factory;

import java.util.HashMap;
import java.util.Map;

public class StaticFactory {
	private static Map<String,Object> cars = new HashMap<>();
	static {
		cars.put("audi", new Car("audi", 300000.0));
		cars.put("BMW", new Car("BMW", 400000.0));
	}
	
	public static Car getCar(String name) {
		return (Car) cars.get(name);
	}
}
