package com.mkyong.beans.sub;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "subhello")
@Scope("singleton")
public class Msg implements MsgInf {

	@Override
	public void getMsg(){
		System.out.println("Click Me sub..!");
	}
}
