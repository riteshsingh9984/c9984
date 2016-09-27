package com.propertyloader;

import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class ConfigPropsBean {

	private String portId;

	public String getPortId() {
		return portId;
	}

	public void setPortId(String portId) {
		this.portId = portId;
	}
	
}
