package com.v_1_0_0.controllers;

import ironman.dbcore.App;

import java.net.UnknownHostException;
import java.util.ArrayList;
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

import com.google.gson.Gson;
import com.v_1_0_0.ControllerUtility.TaskUtility;
import com.v_1_0_0.bean_utility.CreateInfo;
import com.v_1_0_0.models.project_model.model.Project;
import com.v_1_0_0.models.task_model.model.Task;
import com.v_1_0_0.tool_utility.DateUtility;

import curiosity.college.ccbean.College;

/**
 * This is the Task-Module Controller
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 23 April 2016
 */
@Controller
public class TaskController {
	
	/**
	 * This Url use to Go-On task-create page
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 23 April 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = { "/taskCreate" }, method = RequestMethod.GET)
	public ModelAndView taskCreatePage(@RequestParam(value="projectId")String projectId) {
		
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("projectId", projectId.trim());
		return new ModelAndView("v_1_0_0/task/create", "data", data);
	}
	
	/**
	 * This Url use to Saved the requested task in CouchDB
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 23 April 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/taskSave", method = RequestMethod.POST)
	public ModelAndView showMessage(@ModelAttribute("taskCreate") Task task, BindingResult result, HttpServletRequest request) throws Exception {

		Gson gson = new Gson();
		System.out.println("Data= "+gson.toJson(task));
		/*This line set the key in CouchDB*/
		task.set_id(task.getId());
		task.setTag("hello");
		CreateInfo createInfo = new CreateInfo();
		createInfo.setCreateAt(DateUtility.getCurrentDate());
		createInfo.setTime(DateUtility.getCurrentDateLong());
		createInfo.setCreateBy("IRONMAN-TEST");
		task.setCreateInfo(createInfo);
		
		System.out.println("Docks status= "+task.createTask(task));
		
		String path = request.getContextPath();
		return new ModelAndView("redirect:/.."+path+"/taskCreate?projectId="+task.getProjectId().trim());
	}
	
	/**
	 * This Url use to Go-On task-List page
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 23 April 2016
	 * 
	 * @return ModelAndView
	 * @throws UnknownHostException 
	 */
	@RequestMapping(value = { "/taskList" }, method = RequestMethod.GET)
	public ModelAndView projectListPage(@RequestParam(value="projectId")String projectId) throws UnknownHostException {
		
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("projectId", projectId.trim());
		data.put("tag", "all");
		return new ModelAndView("v_1_0_0/task/list", "data", data);
	}
	
	/**
	 * This Url use to get the task-List using ajax call
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 23 April 2016
	 * 
	 * @return ModelAndView
	 */
	@RequestMapping("/tasks")
	public @ResponseBody String getList(@RequestParam(value="tag")String tag, @RequestParam(value="projectId")String projectId,HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new Gson().toJson(TaskUtility.getTasks(tag, projectId));
		//return null;
	}
}