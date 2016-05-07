/**
 * 
 */
package com.v_1_0_0.controllers;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.apache.commons.codec.binary.Base64;

import com.google.gson.Gson;
import com.v_1_0_0.controllerutility.CollegeUtility;

import curiosity.college.ccbean.College;
import curiosity.college.ccbean.CollegeMapper;
import curiosity.fileUtility.Converter;
import curiosity.tool_utility.MapperBeanUtility;

/**
 * This is the College Controller
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 3 May 2016
 */
@Controller
public class CollegeController {

	/**
	 * This Url use to Go-On college-create page
	 * 
	 * @update RITESH SINGH at 3 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 3 May 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = { "/collegeCreate" }, method = RequestMethod.GET)
	public ModelAndView collegeCreatePage() {
		
		Map<String,Object> data = new HashMap<String,Object>();
		return new ModelAndView("v_1_0_0/college/create", "data", data);
	}
	
	/**
	 * This Url use to Saved the requested college in MongoDB
	 * 
	 * @update RITESH SINGH at 4 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 4 May 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/collegeSave", method = RequestMethod.POST)
	public ModelAndView showMessage(@ModelAttribute("collegeCreate") CollegeMapper mapper, BindingResult result, HttpServletRequest request) throws Exception {

		Gson gson = new Gson();
		mapper.setImageBase64(Converter.encodeImageIntoBase64(mapper.getFileData()));
		College college = new College();
		MapperBeanUtility.collegeInboundBean(mapper, college);
		college.createCollege();
		String path = request.getContextPath();
		return new ModelAndView("redirect:/.."+path+"/collegeCreate");
	}
	
	/**
	 * This Url use to Go-On college-List page
	 * 
	 * @update RITESH SINGH at 6 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 6 May 2016
	 * 
	 * @return ModelAndView
	 * @throws UnknownHostException 
	 */
	@RequestMapping(value = { "/collegeList" }, method = RequestMethod.GET)
	public ModelAndView projectListPage() throws UnknownHostException {
		
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("tag", "all");
		return new ModelAndView("v_1_0_0/college/list", "data", data);
	}
	
	/**
	 * This Url use to get the college-List using ajax call
	 * 
	 * @update RITESH SINGH at 6 May 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 6 May 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/colleges")
	public @ResponseBody String getList(@RequestParam(value="tag")String tag, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new Gson().toJson(CollegeUtility.getColleges(tag));
		//return null;
	}
}