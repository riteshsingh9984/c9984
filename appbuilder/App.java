package com.scb.sherlock.contollers.appbuilder;

import com.google.gson.Gson;

public class App {

	public static void main(String...strings){
		User user = new
			    User.UserBuilder("Jhon", "Doe")
			    .age(20)
			    .phone("1234567")
			    .address("Fake address 1234")
			    .build1();
		
		System.out.println("Data "+new Gson().toJson(user));
	}
}
