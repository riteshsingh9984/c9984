package com.mkyong.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "hello")
@Scope("singleton")
public class Msg {

	public void getMsg(){
		System.out.println("Click Me..!");
	}
}
