package com.mkyong.web.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FacebookLink;
import org.springframework.social.facebook.api.PostData;
import org.springframework.social.facebook.api.User;
import org.springframework.social.facebook.api.impl.FacebookTemplate;

import com.google.gson.Gson;
import com.mkyong.beans.FacebookBean;
import com.mkyong.beans.HelloWord;
/*import com.mkyong.springbeanX.AppConfig;*/
import com.mkyong.springbeanX.AppConfig;
import com.mkyong.springbeanX.SocialConfig;

public class App {

	/*
	 * http://docs.spring.io/spring-social-facebook/docs/current/reference/htmlsingle/ 
	 * https://developers.facebook.com/tools/accesstoken/
	 * */	
	
	public static void main(String... args){
		
		
		/*ApplicationContext config = 
			      new AnnotationConfigApplicationContext(SocialConfig.class);*/
		
		String accessToken = "EAAQEsXBRHbgBABqhpXVJZCe4cBSzZCoYMGstv9ZCaGKvHOJol5Sd3daj8iIZBhBQt3htFfXaxtjLtMzORTHq1WuZASHjZCwFADFybkd1URLqZBW9MMdNy5ruhEuxWZAaMu53lei6mHdVfFbxxYrZAA9cWVqbJ9msNqbvJLyeWfMdmXgZDZD";
		
		Facebook facebook = new FacebookTemplate(accessToken);
		
		User profile = facebook.userOperations().getUserProfile();
		
		
		System.out.println(profile.getFirstName());
		
		
		/*FacebookLink link = new FacebookLink("http://www.springsource.org/spring-social",
		        "Spring Social",
		        "The Spring Social Project",
		        "Spring Social is an extension to Spring to enable applications to connect with service providers.");
		facebook.feedOperations().postLink("I'm trying out Spring Social!", link);
		facebook.feedOperations().post(new PostData("me").message("I'm trying out Spring Social!")
		    .link("http://www.springsource.org/spring-social", null, "Spring Social", "The Spring Social Project", "Spring Social is an extension to Spring to enable applications to connect with service providers."));
		*/
		/*============================================================================*/
		/*ApplicationContext config = 
			      new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloWord hd = (HelloWord)config.getBean(HelloWord.class);
		FacebookBean fb = (FacebookBean)config.getBean(FacebookBean.class);
		System.out.println("AppID= "+fb.getAppId());
		System.out.println("AppSecret= "+fb.getAppSecret());
		
		System.out.println("ConfigMemberCalling= "+hd.toString());*/
		
		/*============================================================================*/
		
		/*==============================================================================*/
		/*AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();*/
		/*
		 * Below line will scan the given package for Components. It will be
		 * refreshed then to get bean from the same.
		 */
		/*annotationContext.scan("com.mkyong.beans");
		annotationContext.refresh();
		
		HelloWord hw = (HelloWord)annotationContext.getBean("helloword");
		System.out.println("MemberCalling= "+hw.toString());*/
		/*=================================================================================*/
	}
}
