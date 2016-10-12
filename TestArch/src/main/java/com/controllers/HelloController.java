package com.controllers;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.models.CompanyModel;
import com.models.EmployeeModel;


@Controller
public class HelloController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}
	
	
	

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		ModelAndView model = new ModelAndView();
		model.setViewName("hello");
		model.addObject("msg", name);

		return model;
	}
	
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ModelAndView projectListPage() throws UnknownHostException {
		
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();
		/*
		 * Below line will scan the given package for Components. It will be
		 * refreshed then to get bean from the same.
		 */
		annotationContext.scan("com.models");
		annotationContext.refresh();
		
		EmployeeModel employee = (EmployeeModel)annotationContext.getBean("employeebean");
		employee.setId(345634L);
		employee.setName("HJGHJ");
		employee.setSalary("4564346");
		CompanyModel company = (CompanyModel)annotationContext.getBean("companybean");
		company.setId("345345");
		company.setName("IBM");
		
		System.out.println("MemberCalling= "+company.toString());
		
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("tag", "all");
		return new ModelAndView("hello", "employee", employee);
	}
}