package com.propertyloader;

import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class DbPropsBean {

	private String dbIp;

	public String getDbIp() {
		return dbIp;
	}

	public void setDbIp(String dbIp) {
		this.dbIp = dbIp;
	}
}
