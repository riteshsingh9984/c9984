package com.mkyong.beans.sub;

import org.springframework.stereotype.Component;

@Component(value = "subhello")
public class Msg implements MsgInf {

	@Override
	public void getMsg(){
		System.out.println("Click Me sub..!");
	}
}
