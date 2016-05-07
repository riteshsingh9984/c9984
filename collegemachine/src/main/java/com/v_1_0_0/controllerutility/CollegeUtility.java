package com.v_1_0_0.controllerutility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import curiosity.college.ccbean.College;

/**
 * This is the Task-Module Controller-Utility
 * 
 * @author RITESH SINGH
 * @version 1.0.0, 23 April 2016
 */
public class CollegeUtility {

	/**
	 * This method use to access correct data for tasks
	 * 
	 * @update RITESH SINGH at 23 April 2016
	 * @author RITESH SINGH
	 * @since version 1.0.0, 23 April 2016
	 * 
	 * @return Map<String,Object>
	 */
	public static Map<String,Object> getColleges(String tag) throws JsonSyntaxException, Exception{
		Map<String,Object>map=new HashMap<String,Object>();	
		
		if(tag.equals("all")){
			return getCollegeList();
		}
		return map;
	}

	public static Map<String,Object> getCollegeList() throws JsonSyntaxException, Exception{
		Map<String,Object>map=new HashMap<String,Object>();
		Map<String,Object>map1=new HashMap<String,Object>();
		Gson gson = new Gson();
		List<Object>list=new ArrayList<Object>();
		College college = new College();
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
			
			for(College data: college.getCollegeList()){
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
							if(data.getName()!=null){
								map1.put("1",data.getName());
							}else
								map1.put("1","not set");
						}catch(Exception ee){
							map1.put("1","Exception");
						}
						
						try{
							if(data.getApprovedTo()!=null){
								map1.put("2",data.getApprovedTo());
							}else
								map1.put("2","not set");
						}catch(Exception ee){
							map1.put("2","Exception");
						}
						if(data.getCode()!=null){
							map1.put("2",data.getCode());
						}else
							map1.put("2","not set");
						
						try{
							if(String.valueOf(data.getFounderName())!=null){
								map1.put("3",String.valueOf(data.getFounderName()));
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
