package com.v_1_0_0.controllers;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curiosity.college.ccbean.College;

/**
 * This is the GoogleMap Controller
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 7 May 2016
 */
@Controller
public class GoogleMapController {
	
	/**
	 * This Url use to Go-On google map
	 * 
	 * @update RITESH SINGH at 7 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 7 May 2016
	 * 
	 * @return ModelAndView
	 * @throws UnknownHostException 
	 */
	@RequestMapping(value = { "/googlemap" }, method = RequestMethod.GET)
	public ModelAndView collegeCreatePage(@RequestParam(value="id")String id) throws UnknownHostException {
		
		System.out.println("ID= "+id);
		College col = new College(id);
		col = col.getCollegeById();
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("latitude", col.getLatitude());
		data.put("longitude", col.getLongitude());
		data.put("address", col.getAddress());
		
		return new ModelAndView("v_1_0_0/googlemap/index", "data", data);
	}
}
