package com.mkyong.springbeanX;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.mkyong.beans.FacebookBean;
import com.mkyong.beans.HelloWord;

@Configuration
@PropertySources({
	@PropertySource(value = "classpath:config/config.properties", ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:config/db.properties", ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:config/social.properties", ignoreResourceNotFound=true)
})
public class AppConfig {
	
	
	@Autowired
	private Environment env;
	
	@Bean
	public HelloWord helloWord(){
		
		HelloWord hl = new HelloWord();
		hl.setDbIp(env.getProperty("db.ip"));
		hl.setPortIp(env.getProperty("port.ip"));
		return hl;
	}
	
	@Bean
	public FacebookBean facebookBean(){
		FacebookBean bean = new FacebookBean();
		bean.setAppId(env.getProperty("facebook.app.id"));
		bean.setAppSecret(env.getProperty("facebook.app.secret"));
		
		return bean;
	}
}
