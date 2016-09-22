package com.mkyong.beans;

import org.springframework.stereotype.Component;

@Component(value = "hello")
public class Msg {

	public void getMsg(){
		System.out.println("Click Me..!");
	}
}
