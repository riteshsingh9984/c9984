package com.mkyong.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mkyong.beans.sub.MsgInf;

@Component(value = "helloword")
public class HelloWord {

	private String portIp;
	private String dbIp;
	private MsgInf service;
	
	@Autowired
	public
	HelloWord(com.mkyong.beans.sub.Msg ms){
		service = ms;
		portIp="PortIP Not-Found";
		dbIp="DBIp Not-Found";
		System.out.println(this.toString());
		service.getMsg();
	}
	
	public HelloWord(){}
	
	public String getPortIp() {
		return portIp;
	}

	public void setPortIp(String portIp) {
		this.portIp = portIp;
	}

	public String getDbIp() {
		return dbIp;
	}

	public void setDbIp(String dbIp) {
		this.dbIp = dbIp;
	}
	
	public String toString(){
		return portIp+dbIp;
		
	}
}
