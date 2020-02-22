package com.tedu.spring.bean;

import java.util.Properties;

public class DataSource {
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public DataSource(Properties properties) {
		super();
		this.properties = properties;
	}

	public DataSource() {
		super();
	}

	@Override
	public String toString() {
		return "DataSource [properties=" + properties + "]";
	}
	
}
