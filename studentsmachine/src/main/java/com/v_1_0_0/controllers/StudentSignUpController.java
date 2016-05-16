package com.v_1_0_0.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import curiosity.fileUtility.Converter;
import curiosity.student.ccbean.StudentSignup;
import curiosity.student.ccbean.StudentSignupMapper;

/**
 * This is the StudentSignUP Controller
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 14 May 2016
 */
@Controller
public class StudentSignUpController {
	
	/**
	 * This Url use to Go-On Student-SignUP page
	 * 
	 * @update RITESH SINGH at 14 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 14 May 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = { "/studentSignUp" }, method = RequestMethod.GET)
	public ModelAndView collegeCreatePage() {
		
		Map<String,Object> data = new HashMap<String,Object>();
		return new ModelAndView("v_1_0_0/student/signup", "data", data);
	}
	
	/**
	 * This Url use to Saved the requested studentSignup in MongoDB
	 * 
	 * @update RITESH SINGH at 14 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 14 May 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/studentSignupSave", method = RequestMethod.POST)
	public ModelAndView showMessage(@ModelAttribute("studentSignupCreate") StudentSignupMapper mapper, BindingResult result, HttpServletRequest request) throws Exception {

		Gson gson = new Gson();
		mapper.setImageBase64(Converter.encodeImageIntoBase64(mapper.getFileData()));
		
		// creating UUID      
	    UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");     
	        
	    // checking the value of random UUID
	    System.out.println("Random UUID value: "+uid.randomUUID());
		
		StudentSignup student = new StudentSignup(String.valueOf(uid.randomUUID()));
		mapper.studentSignupInboundBean(mapper, student);
		student.createStudent();
		String path = request.getContextPath();
		return new ModelAndView("redirect:/.."+path+"/collegeCreate");
	}
}