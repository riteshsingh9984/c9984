package com.mkyong.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mkyong.beans.HelloWord;
/*import com.mkyong.springbeanX.AppConfig;*/
import com.mkyong.springbeanX.AppConfig;

public class App {

	public static void main(String... args){
		
		ApplicationContext config = 
			      new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloWord hd = (HelloWord)config.getBean(HelloWord.class);
		System.out.println("ConfigMemberCalling= "+hd.toString());
		
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		/*
		 * Below line will scan the given package for Components. It will be
		 * refreshed then to get bean from the same.
		 */
		annotationContext.scan("com.mkyong.beans");
		annotationContext.refresh();

		HelloWord hw = (HelloWord)annotationContext.getBean("helloword");
		System.out.println("MemberCalling= "+hw.toString());
	}
}
