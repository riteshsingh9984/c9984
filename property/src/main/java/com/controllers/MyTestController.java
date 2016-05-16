package com.controllers;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bean.MyDbConfig;
import com.controllers.ApplicationBeanLoader;
import com.utility.Demo;

/**
 * @author RITESH SINGH
  *@version 0.0.0
 */
@Controller
public class MyTestController {
	
	@RequestMapping("/")
	public ModelAndView testMe() throws Exception {
		
		
		/*String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context
                                = new ClassPathXmlApplicationContext(confFile);
        MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");*/
        
        MyDbConfig dbConfig = (MyDbConfig) ApplicationBeanLoader.INSTANCE.getBean("dbConfig");
        
        System.out.println(dbConfig.toString());
        System.out.println("===============================");
        /*context.close();*/
        
        dbConfig.setDbHost("localhost");
        dbConfig.setDbUser("admin");
        System.out.println(dbConfig.toString());
        
		/*Properties prop = new Properties();
		OutputStream output = null;

		try {

			output = new FileOutputStream("db.properties");
			System.out.println("Start the prop setting");
			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, null);
			System.out.println("Done the prop setting");

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}*/
		
		//ConfigurableApplicationContext contxt = new ClassPathXmlApplicationContext(confFile);
		//MyDbConfig dbCfg = (MyDbConfig) context.getBean("dbConfig");
		MyDbConfig dbCfg = (MyDbConfig) ApplicationBeanLoader.INSTANCE.getBean("dbConfig");
		
		
		System.out.println(dbCfg.toString());
		
		//System.out.println("Start Prop="+prop.getProperty("dbuser"));
        
		new Demo();
		
		return new ModelAndView("hello");
	}
}