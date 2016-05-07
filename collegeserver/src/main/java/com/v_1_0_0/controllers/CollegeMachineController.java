package com.v_1_0_0.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * This is the  Controller
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 5 May 2016
 */
@Controller
public class CollegeMachineController {

	/**
	 * This Url use to Go-On Student machine page
	 * 
	 * @update RITESH SINGH at 5 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 5 May 2016
	 * 
	 * @return ModelAndView
	 * @throws IOException 
	 */
	@RequestMapping(value = { "/collegemachine" }, method = RequestMethod.GET)
	public ModelAndView taskCreatePage(HttpServletResponse response, HttpServletRequest request) throws IOException {
		
		String port = String.valueOf(request.getLocalPort());
		String ip = request.getServerName();

		response.sendRedirect("http://"+ip+":"+port+"/collegemachine/collegeList");
		return null;
	}
}
