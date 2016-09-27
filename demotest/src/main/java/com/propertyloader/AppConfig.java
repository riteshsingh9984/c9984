package com.propertyloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
	@PropertySource(value = "classpath:config/config.properties", ignoreResourceNotFound=true),
	@PropertySource(value = "classpath:config/db.properties", ignoreResourceNotFound=true)
})
public class AppConfig {
	
	
	@Autowired
	private Environment env;
	
	@Bean
	public ConfigPropsBean configPropsBean(){
		
		ConfigPropsBean configPropBean = new ConfigPropsBean();
		configPropBean.setPortId(env.getProperty("port.ip"));
		return configPropBean;
	}
	
	@Bean
	public DbPropsBean dbPropsBean(){
		DbPropsBean dbPropsBean = new DbPropsBean();
		dbPropsBean.setDbIp(env.getProperty("db.ip"));
		return dbPropsBean;
	}
	
}
