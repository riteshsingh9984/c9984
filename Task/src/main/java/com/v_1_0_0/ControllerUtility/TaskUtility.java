package com.v_1_0_0.ControllerUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.v_1_0_0.models.project_model.model.Project;
import com.v_1_0_0.models.task_model.model.Task;

/**
 * This is the Task-Module Controller-Utility
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 23 April 2016
 */
public class TaskUtility {

	/**
	 * This method use to access correct data for tasks
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 23 April 2016
	 * 
	 * @return Map<String,Object>
	 */
	public static Map<String,Object> getTasks(String tag, String projectId) throws JsonSyntaxException, Exception{
		Map<String,Object>map=new HashMap<String,Object>();	
		
		if(tag.equals("all")){
			return getTaskList(projectId);
		}
		return map;
	}

	public static Map<String,Object> getTaskList(String projectId) throws JsonSyntaxException, Exception{
		Map<String,Object>map=new HashMap<String,Object>();
		Map<String,Object>map1=new HashMap<String,Object>();
		Gson gson = new Gson();
		List<Object>list=new ArrayList<Object>();
		Task task = new Task();
		try{
			
			/*Sorting the Comments*/
			// Sorting
			/*Collections.sort(task.getWhereQuery("projectId", projectId), new Comparator<Task>() {
			        @Override
			        public int compare(Task task2, Task task1)
			        {

			            return  project2.getCreateInfo().getCreateAt().compareTo(project1.getCreateInfo().getCreateAt());
			        }
			    });*/
			
			for(Task data: task.getWhereQuery("projectId", projectId)){
				map1=new HashMap<String,Object>();
								
				try{
					if( true ){
						
						try{
							if(data.getId()!=null){
								map1.put("0",data.getId());
							}else
								map1.put("0","not set");
						}catch(Exception ee){
							map1.put("0","Exception");
						}
						
						try{
							if(data.getTaskName()!=null){
								map1.put("1",data.getTaskName());
							}else
								map1.put("1","not set");
						}catch(Exception ee){
							map1.put("1","Exception");
						}
						
						try{
							if(data.getProjectId()!=null){
								map1.put("2",data.getProjectId());
							}else
								map1.put("2","not set");
						}catch(Exception ee){
							map1.put("2","Exception");
						}
						if(data.getTaskStatus()!=null){
							map1.put("2",data.getTaskStatus());
						}else
							map1.put("2","not set");
						
						try{
							if(String.valueOf(data.getCompletedHrs())!=null){
								map1.put("3",String.valueOf(data.getCompletedHrs()));
							}else
								map1.put("3","Not-Set");
						}catch(Exception ee){
							map1.put("3","Exception");
						}
						
						try{
							if(data.getCreateInfo().getCreateAt()!=null){
								map1.put("4",data.getCreateInfo().getCreateAt());
							}else
								map1.put("4","not set");
						}catch(Exception ee){
							map1.put("4","Exception");
							ee.printStackTrace();
						}
						
						try{
							
							if(data.getCreateInfo().getCreateBy()!=null){
								map1.put("5",data.getCreateInfo().getCreateBy());
							}else
								map1.put("5","not set");
							
						}catch(Exception ee){
							map1.put("5","Exception");
							ee.printStackTrace();
						}
						
						list.add(map1);
					}
			}catch(Exception ee){
				ee.printStackTrace();
			}
			}
			
			
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
		map.put("data",list);
		return map;
	}
}
